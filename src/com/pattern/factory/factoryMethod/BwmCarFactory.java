package com.pattern.factory.factoryMethod;

import com.pattern.factory.BwmCar;
import com.pattern.factory.ICar;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:16
 */
public class BwmCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BwmCar();
    }
}
