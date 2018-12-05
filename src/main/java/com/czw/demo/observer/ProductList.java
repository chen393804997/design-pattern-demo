package com.czw.demo.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 被观察的产品列表（被观察者）
 * @author: czw
 * @create: 2018-10-16 23:31
 **/
public class ProductList extends Observable {
    /** 产品列表*/
    private List<String> produtList = null;
    /** 产品列表实体*/
    private static ProductList instance;

    private ProductList(){}

    /**
     * 获取产品列表实例
     * @return 产品实体
     */
    public static ProductList getInstance(){
        if (instance == null){
            instance = new ProductList();
            instance.produtList = new ArrayList<String>(5);
        }
        return instance;
    }

    /**
     * 添加观察者
     * @param observer
     */
    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    /**
     * 添加新的商品
     * @param newProduct 商品名称
     */
    public void addProduct(String newProduct){
        produtList.add(newProduct);
        System.out.println("产品列表新增商品:"+newProduct);
        //设置被观察者对象发生变化
        this.setChanged();
        //通知观察者，传递新产品
        this.notifyObservers(newProduct);
    }

    public static void main(String[] args) {
        ProductList productList = ProductList.getInstance();
        JingDongObserver jingDongObserver = new JingDongObserver();
        TaobaoObserver taobaoObserver = new TaobaoObserver();
        //向被观察者中添加观察者
        productList.addProductListObserver(jingDongObserver);
        productList.addProductListObserver(taobaoObserver);
        //商品列表新增商品
        productList.addProduct("电脑");
    }

}
