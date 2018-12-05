package com.czw.demo.Factory;

/**
 * 减法类
 * @author: czw
 * @create: 2018-09-24 15:30
 **/
public class OperationSub extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}
