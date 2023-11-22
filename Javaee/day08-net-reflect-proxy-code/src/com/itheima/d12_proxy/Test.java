package com.itheima.d12_proxy;

public class Test {
    public static void main(String[] args) {
        // 1、创建一个杨超越
        Star star = new Star("杨超越");
        // 2、为杨超越创建代理对象，以后找代理来做事。、
        StarService starProxy = ProxyUtil.createStarProxy(star);
        System.out.println(starProxy.sing("好日子"));
        starProxy.dance();

    }
}
