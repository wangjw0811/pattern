package com.pattern.factory.test;

import com.pattern.factory.ICar;
import com.pattern.factory.factoryMethod.BenzCarFactory;
import com.pattern.factory.factoryMethod.BwmCarFactory;
import com.pattern.factory.factoryMethod.ICarFactory;

/**
 * @author Jims Wang
 * @date 2019-04-16 21:19
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICarFactory carFactory = new BwmCarFactory();
        ICar car = carFactory.createCar();
        car.produce();

        carFactory = new BenzCarFactory();
        car = carFactory.createCar();
        car.produce();
}


}
