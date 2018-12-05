package com.czw.demo.strategy;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文对象
 * @author: czw
 * @create: 2018-09-24 15:55
 **/
public class Context {

    private final Map<String,Strategy> map = new HashMap<String,Strategy>(){
        {
            put("a",new ConcreteStrategyA());
            put("b",new ConcreteStrategyB());
        }
    };
    /** 拥有抽象算法类*/
    private Strategy strategy;

    public Context(String type){
        strategy = map.get(type);
    }

    /**
     * 新增算法类到map中
     * @param concreteName 算法的标识
     * @param tClass 具体的算法类
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public<T> boolean addStrategy(String concreteName,Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T strategy =  tClass.newInstance();
        if (StringUtils.isEmpty(concreteName) || strategy == null){
            throw new NullPointerException();
        }
        map.put(concreteName,(Strategy) strategy);
        this.strategy = map.get(concreteName);
        return true;
    }

    public void contextInterface(){
        if (strategy == null){
            throw new NullPointerException();
        }
        //执行相应的算法
        strategy.AlgorithmInterface();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Context context = new Context("a");
        context.contextInterface();
        //扩展方法
        context.addStrategy("c",ConcreteStrategyC.class);
        context.contextInterface();
    }
}
