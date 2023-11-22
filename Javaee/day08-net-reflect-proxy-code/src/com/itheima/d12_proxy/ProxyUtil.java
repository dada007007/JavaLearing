package com.itheima.d12_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    // 写一个方法，为明星对象产生代理对象
    public static StarService createStarProxy(StarService star){
        StarService starProxy = (StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                star.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // proxy: 代表当前代理对象。
                        // method :代表正需要执行的业务方法的反射形式
                        // args : 代表执行方法需要的参数值
                        // 声明代理要干事的地方（代理的核心逻辑）
                        if(method.getName().equals("sing")){
                            System.out.println("准备话筒，收钱100万！");
                        }else if(method.getName().equals("dance")){
                            System.out.println("准备场地，收钱300万~~");
                        }

                        // 让杨超越真正自己去干事情
                        Object result = method.invoke(star, args);
                        // 返回真正业务对象执行方法后的结果
                        return result;
                    }
                });

        return starProxy;
    }
}
