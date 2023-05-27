package com.wzm.pattern.creation.singleton;

/**
 * 线程安全的懒汉式单例实现
 *
 * <p>懒汉式的单例模式适用于构建过程比较耗时，占用内存大，并且使用不太频繁的类。
 * 如果构建过程简单，加载后立即使用，更推荐饿汉式的实现，因为更加清晰</p>
 *
 * <p>也可以通过枚举实现单例，这是最推荐的方式</p>
 *
 * @author wuzhiming@itiger.com
 */
public class Singleton1 {

    /**
     * 单例的实例引用
     * 为什么要加 volatile 关键字：https://juejin.cn/post/6844903772892692487
     */
    private static volatile Singleton1 instance;

    private Singleton1() { // 是优化构造方法
        if (instance != null)
            throw new UnsupportedOperationException("不支持重复创建"); // 方法内判断，防止通过反射破坏单例
    }

    public static Singleton1 getInstance() {
        if (instance == null) { // 外层的判断用于提高方法的性能，防止每次调用都获取同步锁
            synchronized (Singleton1.class) { // 同步块用来控制线程并发
                if (instance == null)  // 双检判断，防止多线程冲突
                    instance = new Singleton1(); // 初始化实例
            }
        }
        return instance;
    }
}
