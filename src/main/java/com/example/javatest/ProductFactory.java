package com.example.javatest;

/**
 * ProductFactory:产品工厂
 * Created by My on 2018/1/17.
 */

public class ProductFactory {
    public static Product getProduct(String name) {
        if ("phone".equals(name)) {
            return new Phone();
        } else if ("computer".equals(name)) {
            return new Computer();
        } else {
            return null;
        }
    }
}
