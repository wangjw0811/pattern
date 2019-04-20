package com.pattern.singleton;

import com.pattern.singleton.registSingleton.ContainerSingleton;
import com.pattern.singleton.registSingleton.EnumSingleton;
import com.pattern.singleton.registSingleton.User;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author Jims Wang
 * @date 2019-04-20 08:23
 */
public class SingletonTest {

    public static void main(String[] args) {
        //1 饿汉式
        System.out.println(HungrySingleton.getInstance() == HungrySingleton.getInstance());//true
        //2 懒汉式
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());//true

        try {
            //通过反射破坏单例
            Class<LazySingleton> clazz = LazySingleton.class;
            // 获取私有构造函数
            Constructor declaredConstructor = clazz.getDeclaredConstructor(null);
            // 对私有构造函数设置访问权限
            declaredConstructor.setAccessible(true);
//            System.out.println(LazySingleton.getInstance() == declaredConstructor.newInstance());//false
        } catch (Exception e) {
            e.printStackTrace();
        }

        //序列化破坏单利,此时 我们对 LazySingleton 实现序列化
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2;
        String fileName = "LazySingleton.class";
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            System.out.println();
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj2 = (LazySingleton)ois.readObject();
            ois.close();
            System.out.println(obj1 == obj2);//false 增加readResolve()后true
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 注册式单例有两种写法：一种为容器缓存，一种为枚举登记
        // 5 注册式单例之枚举式单例
        System.out.println(EnumSingleton.getInstance() == EnumSingleton.getInstance());
        // 6 注册式单例之容器式单例
        Object bean1 = ContainerSingleton.getBean("com.pattern.singleton.registSingleton.ContainerSingleton");
        Object bean2 = ContainerSingleton.getBean("com.pattern.singleton.registSingleton.ContainerSingleton");
        System.out.println(bean1 == bean2 );

        // 6 ThreadLocal 线程单例
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        try {
            Thread t1 = new Thread(new SingletonThread());
            t1.start();
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
