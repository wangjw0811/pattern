package com.pattern.factory.abstractFactory;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:42
 */
public class BenzTruck implements ITruck {
    @Override
    public void produce() {
        System.out.println("生产奔驰卡车");
    }
}
