package com.pattern.singleton;

/**
 * @author Jims Wang
 * @date 2019-04-20 17:27
 */
public class SingletonThread implements Runnable {
    @Override
    public void run() {
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
