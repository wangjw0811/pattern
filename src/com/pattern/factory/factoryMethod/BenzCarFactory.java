package com.pattern.factory.factoryMethod;

import com.pattern.factory.BenzCar;
import com.pattern.factory.ICar;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:17
 */
public class BenzCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BenzCar();
    }
}
