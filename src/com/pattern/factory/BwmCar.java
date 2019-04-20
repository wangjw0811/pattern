package com.pattern.factory;

/**
 * @author Jims Wang
 * @date 2019-04-16 20:59
 */
public class BwmCar implements ICar {
    @Override
    public void produce() {
        System.out.println("生产宝马汽车");
    }
}
