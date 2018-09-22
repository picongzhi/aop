package com.pcz.aop.greeting;

public class Client {

    public static void main(String[] args) {
//        Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
//        greetingProxy.sayHello("Jack");

//        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
//        greeting.sayHello("Jack");

        Greeting greeting = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        greeting.sayHello("Jack");
    }
}
