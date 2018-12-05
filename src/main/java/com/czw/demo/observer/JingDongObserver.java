package com.czw.demo.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: czw
 * @create: 2018-10-16 23:41
 **/
public class JingDongObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.out.println("京东收到新商品通知："+newProduct);
    }
}
