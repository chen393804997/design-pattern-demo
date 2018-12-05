package com.czw.demo.Factory;

/**
 * 加法类
 * @author: czw
 * @create: 2018-09-24 15:28
 **/
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result =0;
        result = getNumberA() + getNumberB();
        return result;
    }
}
