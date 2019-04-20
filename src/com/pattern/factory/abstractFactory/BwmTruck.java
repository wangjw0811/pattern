package com.pattern.factory.abstractFactory;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:39
 */
public class BwmTruck implements ITruck {

    @Override
    public void produce() {
        System.out.println("生产宝马卡车");
    }
}
