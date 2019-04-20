package com.pattern.singleton;

/**
 *  饿汉式
 *  在类加载的时候就立即初始化，并且创建单例对象。绝对线程安全，在线
 * 程还没出现以前就是实例化了，不可能存在访问安全问题。
 * 优点：没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存
 * @author Jims Wang
 * @date 2019-04-20 08:21
 */
public class HungrySingleton {

    //写法一
//    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //写法二 利用静态代码块机制
    private static final HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


}
