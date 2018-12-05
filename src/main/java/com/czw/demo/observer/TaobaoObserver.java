package com.czw.demo.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: czw
 * @create: 2018-10-16 23:43
 **/
public class TaobaoObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProdoct =(String) arg;
        System.out.println("淘宝收到新商品通知："+newProdoct);
    }
}
