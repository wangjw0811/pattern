package com.pattern.factory.abstractFactory;

import com.pattern.factory.BwmCar;
import com.pattern.factory.ICar;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:37
 */
public class BwmFactory implements IFactory {
    @Override
    public ICar produceCar() {
        return new BwmCar();
    }

    @Override
    public ITruck produceTruck() {
        return new BwmTruck();
    }
}
