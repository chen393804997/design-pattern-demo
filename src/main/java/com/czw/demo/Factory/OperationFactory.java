package com.czw.demo.Factory;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 算法工厂
 * @author: czw
 * @create: 2018-09-24 15:32
 **/
public class OperationFactory {

    public static Map<String,Operation> map = null;
    static {
        map = new HashMap<>();
        map.put("+",new OperationAdd());
        map.put("-",new OperationSub());
    }

    public static Operation createOperation(String operate){
        if (StringUtils.isEmpty(operate)){
            return null;
        }
        Operation operation = null;
        operation = map.get(operate);
        return operation;
    }

    public static void main(String[] args) {
        Operation operation = null;
        operation = OperationFactory.createOperation("+");
        if (operation != null){
            operation.setNumberA(12);
            operation.setNumberB(3);
            double result = operation.getResult();
            System.out.println("结果为："+result);
        }
    }



}
