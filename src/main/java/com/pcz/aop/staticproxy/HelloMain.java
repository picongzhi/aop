package com.pcz.aop.staticproxy;

public class HelloMain {

    public static void main(String[] args) {
        Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");
    }
}
