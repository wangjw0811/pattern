package com.pattern.factory;


/**
 * @author Jims Wang
 * @date 2019-04-16 20:59
 */
public class BenzCar implements ICar {
    @Override
    public void produce() {
        System.out.println("生产奔驰汽车");
    }
}
