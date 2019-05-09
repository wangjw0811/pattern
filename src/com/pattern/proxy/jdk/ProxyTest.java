package com.pattern.proxy.jdk;



/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 10:58:19
 **/
public class ProxyTest {

    public static void main(String[] args) {
        ProxyHandle handle = new ProxyHandle();
        Agency instance = (Agency) handle.getInstance(new Worker());
        instance.findSomThing("工作");
    }

}
