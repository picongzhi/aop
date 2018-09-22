package com.pcz.aop.spring;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
//        ProxyFactory proxyFactory = new ProxyFactory();
//        proxyFactory.setTarget(new GreetingImpl());
//        proxyFactory.addAdvice(new GreetingBeforeAdvice());
//        proxyFactory.addAdvice(new GreetingAfterAdvice());
//        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice());
//        proxyFactory.addAdvice(new GreetingAroundAdvice());

//        Greeting greeting = (Greeting) proxyFactory.getProxy();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Greeting greeting = (Greeting) context.getBean("greetingProxy");
//
//        greeting.sayHello("Jack");

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingProxy");
//        greetingImpl.sayHello("Jack");
//
//        Apology apology = (Apology) greetingImpl;
//        apology.saySorry("Jack");

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingImpl");
//        greetingImpl.sayHello("Jack");
//        greetingImpl.goodMorning("Jack");
//        greetingImpl.goodNight("Jack");

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greetingImpl");
//        greetingImpl.sayHello("Jack");
//        greetingImpl.goodMorning("Jack");
//        greetingImpl.goodNight("Jack");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Greeting greeting = (Greeting) context.getBean("greetingImpl");
        greeting.sayHello("Jack");

        Apology apology = (Apology) greeting;
        apology.saySorry("Jack");
    }
}
