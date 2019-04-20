package com.pattern.singleton.registSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例之容器缓存式单例
 * 容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的
 * @author Jims Wang
 * @date 2019-04-20 10:26
 */
public class ContainerSingleton {
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    private ContainerSingleton(){

    }
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object object = null;
                try{
                    object = Class.forName(className);
                    ioc.put(className,object);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return object;
            }else{
                return ioc.get(className);
            }
        }
    }
}
