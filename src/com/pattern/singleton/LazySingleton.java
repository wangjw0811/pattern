package com.pattern.singleton;

import java.io.Serializable;

/**
 * 懒汉式
 * 被外部类调用的时候内部类才会加载
 * @author Jims Wang
 * @date 2019-04-20 08:35
 */
public class LazySingleton implements Serializable
{
//    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
        //防止反射攻击
       if(LazyHolder.singleton != null){
           throw new RuntimeException("不允许重复创建实例");
       }
    }

    // 1 线程不安全
//    public static LazySingleton getInstance(){
//        if(lazySingleton == null){
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    // 2 方法体加锁保证线程安全,但是性能低
//    public static synchronized LazySingleton getInstance(){
//        if(lazySingleton == null){
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    // 3 双重检查锁,保障线程安全,性能有所提高
//    public static synchronized LazySingleton getInstance(){
//        if(lazySingleton == null){
//            synchronized (LazySingleton.class){
//                if(lazySingleton == null){
//                    lazySingleton = new LazySingleton();
//                }
//            }
//        }
//        return lazySingleton;
//    }

    // 4 静态内部类方式 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized 性能问题。内部类一定是要在方
    //法调用之前初始化，巧妙地避免了线程安全问题
    private static class LazyHolder{
        private static final LazySingleton singleton = new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return LazyHolder.singleton;
    }

    // 防止反序列化攻击
    //分析源码 得出结论实际上实例化了两次，只不过新创建的对象没有被返回而已。那如果，创建对象的动作发生频率增大，就意味着内存分配开销也就随之增大
    private Object readResolve(){
        return LazyHolder.singleton;
    }

}
