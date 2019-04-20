package com.pattern.factory.simpleFactory;

import com.pattern.factory.BenzCar;
import com.pattern.factory.BwmCar;
import com.pattern.factory.ICar;

/**
 * 简单工厂模式
 * 优点：只需传入一个正确的参数，就可以获取你所需要的对象无须知道其创建的细节。
 * 缺点：工厂类的职责相对过重，增加新的产品时需要修改工厂类的判断逻辑，违背开闭原则。
 *      不易于扩展过于复杂的产品结构。
 * @author Jims Wang
 * @date 2019-04-16 20:56
 */
public class CarFactory {

    public void produce(String car){
        if(car.equals("bwm")){
            ICar bwm = new BwmCar();
            bwm.produce();
        }else if(car.equals("benz")){
            ICar benz = new BenzCar();
            benz.produce();
        }else{
            throw new RuntimeException("暂不支持其他品牌");
        }
    }

    public void produce(Class<? extends ICar> clazz){
        try {
            if(clazz != null){
                clazz.newInstance().produce();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
