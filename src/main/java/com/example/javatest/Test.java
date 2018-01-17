package com.example.javatest;

/**
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式是工厂模式家族中最简单实用的模式。
 */
public class Test {

    public static void main(String[] args) {

        Product phone = ProductFactory.getProduct("phone");
        if (phone != null) {
            phone.work();
        }
    }


}
