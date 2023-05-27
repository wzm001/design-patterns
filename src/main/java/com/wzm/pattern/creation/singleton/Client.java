package com.wzm.pattern.creation.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wuzhiming@itiger.com
 */
public class Client {

    public static void main(String[] args) {
        checkSingleton();
        checkReflection();
    }

    private static void checkReflection() {
        // 校验反射（前提是已经调用过getInstance）
        Constructor<?>[] constructors = Singleton1.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            try {
                constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkSingleton() {
        // 校验多次获取的是不是相同的对象
        int count = 10;
        while (count-- > 0) {
            System.out.println(Singleton1.getInstance());
        }
    }
}
