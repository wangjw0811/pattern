package com.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-09 10:43:32
 **/
public class ProxyHandle implements InvocationHandler {

    private Object object;//被代理对象

    public Object getInstance(Object obj) {
        this.object = obj;
        Class<?> clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do before");
        Object obj = method.invoke(this.object, args);
        System.out.println("do after");
        return obj;
    }
}
