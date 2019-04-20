package com.pattern.factory.test;

import com.pattern.factory.BwmCar;
import com.pattern.factory.simpleFactory.CarFactory;

/**
 * @author Jims Wang
 * @date 2019-04-16 20:59
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
//        carFactory.produce("bwm");
//        carFactory.produce("benz");
//        carFactory.produce("Audi");
        carFactory.produce(BwmCar.class);
    }


}
