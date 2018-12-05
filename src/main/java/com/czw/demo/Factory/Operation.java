package com.czw.demo.Factory;

/**
 * 运算类
 * @author: czw
 * @create: 2018-09-24 15:25
 **/
public class Operation {

    private double numberA = 0;

    private double numberB = 0;

    public Operation() {
    }

    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getResult(){
        double result = 0;
        return result;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                '}';
    }
}