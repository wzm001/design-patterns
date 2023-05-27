package com.wzm.pattern.creation.builder;

/**
 * @author wuzhiming@itiger.com
 */
public class Client {

    public static void main(String[] args) {
        MilkTea tea1 = new MilkTea.Builder("原味").build();
        System.out.println(tea1);
        MilkTea tea2 = new MilkTea.Builder("原味").size("小杯").build();
        System.out.println(tea2);
        MilkTea tea3 = new MilkTea.Builder("原味").size("大杯").ice(true).build();
        System.out.println(tea3);
    }
}
