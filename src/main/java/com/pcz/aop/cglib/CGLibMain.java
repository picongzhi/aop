package com.pcz.aop.cglib;

public class CGLibMain {

    public static void main(String[] args) {
//        CGLibProxy cgLibProxy = new CGLibProxy();
//        Hello helloProxy = cgLibProxy.getProxy(HelloImpl.class);
//        helloProxy.say("Jack");
        Hello hellpProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        hellpProxy.say("Jack");
    }
}
