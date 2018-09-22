package com.pcz.aop.staticproxy;

public class HelloImpl implements Hello {

    @Override
    public void say(String name) {
        System.out.println("Hello! " + name);
    }
}
