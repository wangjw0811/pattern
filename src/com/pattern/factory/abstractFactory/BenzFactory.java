package com.pattern.factory.abstractFactory;

import com.pattern.factory.BenzCar;
import com.pattern.factory.ICar;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:43
 */
public class BenzFactory implements IFactory {
    @Override
    public ICar produceCar() {
        return new BenzCar();
    }

    @Override
    public ITruck produceTruck() {
        return new BenzTruck();
    }
}
