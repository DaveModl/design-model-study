package com.structure.proxy.demo.cglib;



import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 拦截器
 */
public class Intercerpetor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
       Object invoke = methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return invoke;
    }
}
