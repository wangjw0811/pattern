package com.pattern.proxy.jdk;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 10:56:53
 **/
public class Worker implements Agency {


    @Override
    public void findSomThing(String str) {
        System.out.println("打工仔找"+str);
    }
}
