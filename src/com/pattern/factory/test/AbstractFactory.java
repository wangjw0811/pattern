package com.pattern.factory.test;

import com.pattern.factory.ICar;
import com.pattern.factory.abstractFactory.BenzFactory;
import com.pattern.factory.abstractFactory.BwmFactory;
import com.pattern.factory.abstractFactory.IFactory;
import com.pattern.factory.abstractFactory.ITruck;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:44
 */
public class AbstractFactory {
    public static void main(String[] args) {
        IFactory factory = new BenzFactory();
        ICar car = factory.produceCar();
        car.produce();
        ITruck truck = factory.produceTruck();
        truck.produce();
    }
}
