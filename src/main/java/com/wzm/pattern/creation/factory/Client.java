package com.wzm.pattern.creation.factory;

/**
 * 客户端调用
 *
 * @author wuzhiming@itiger.com
 */
public class Client {

    public static void main(String[] args) {
        createFruit();
        createByFactory();
    }

    /**
     * 传统的创建对象方式，对象的具体实现耦合到客户代码中
     */
    private static void createFruit() {
        System.out.println("直接创建------");
        Apple apple = new Apple();
        Pear pear = new Pear();
        apple.eat();
        pear.eat();
    }

    /**
     * 通过简单工厂创建对象，代码中不出现具体的实现类，方便后续扩展
     */
    private static void createByFactory() {
        System.out.println("简单工厂创建-----");
        Fruit apple = SimpleFactory.create("apple");
        Fruit pear = SimpleFactory.create("pear");
        apple.eat();
        pear.eat();
    }
}
