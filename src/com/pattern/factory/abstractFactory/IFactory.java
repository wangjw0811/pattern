package com.pattern.factory.abstractFactory;

import com.pattern.factory.ICar;

/**
 *抽象工厂模式
 * 车工厂既然生产汽车 也能生产卡车
 * @author Jims Wang
 * @date 2019-04-16 21:30
 */
public interface IFactory {

    ICar produceCar();

    ITruck produceTruck();
}
