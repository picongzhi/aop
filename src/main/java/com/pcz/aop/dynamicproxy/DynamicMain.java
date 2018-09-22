package com.pcz.aop.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicMain {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        DynamicProxy dynamicProxy = new DynamicProxy(hello);

//        Hello helloProxy = (Hello) Proxy.newProxyInstance(
//            hello.getClass().getClassLoader(),
//            hello.getClass().getInterfaces(),
//            dynamicProxy
//        );

        Hello helloProxy = dynamicProxy.getProxy();

        helloProxy.say("Jack");
    }
}
