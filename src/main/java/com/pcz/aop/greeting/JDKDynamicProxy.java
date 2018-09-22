package com.pcz.aop.greeting;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler {

    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        System.out.println("Proxy class name: " + proxy.getClass().getName());
        System.out.println("Proxy parent class name: " + proxy.getClass().getSuperclass().getName());
        System.out.println("Method name: " + method.getName());
        System.out.println("Parameters: ");
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
        after();
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
