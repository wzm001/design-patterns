package com.wzm.pattern.creation.factory;

/**
 * 简单工厂，工厂模式最简单的一种实现
 *
 * <p>简单工厂实现简单，但违反了单一指责原则。之后如果要创建的类越来越多，工厂方法或过于庞大，承担了过多的职责。一旦有某个类需要修改创建方式，都会修改当前的工厂类。</p>
 * <p>违反了开闭原则。如果加入新的产品类型，需要修改当前工厂方法，而不是通过扩展的形式实现</p>
 *
 * @author wuzhiming@itiger.com
 */
public class SimpleFactory {

    public static Fruit create(String type) {
        switch (type.toUpperCase()) {
            case "APPLE":
                return new Apple();
            case "PEAR":
                return new Pear();
            default:
                throw new IllegalArgumentException("unknown type :" + type);
        }
    }
}
