/*
package com.example.demo.service.impl;

import com.example.demo.proxy.CglibProxy;
import com.example.demo.proxy.jdkProxy;
import com.example.demo.service.UserService;
import com.example.demo.util.Thread.Calculator;
import com.example.demo.util.Thread.MyThread;
import com.example.demo.util.Thread.ReaderResult;
import org.hibernate.id.GUIDGenerator;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.UUID;

public class UserServiceImplTest {
    public static void main(String[] args) {

    }

    */
/**
     * 测试JDKProxy
     *//*

    @Test
    public void getName() {
        UserService userService = new UserServiceImpl();
        //创建一个InvocationHandler，描述我们希望代理者执行哪些操作
        InvocationHandler invocationHandler = new jdkProxy(userService);
        //通过刚才创建的InvocationHandler，
        // 创建真正的代理者。第一个参数是类加载器，第二个参数是这个代理者实现哪些接口(与被代理者实现的是相同的接口)
        UserService userServiceProxy = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), invocationHandler);
        System.out.println(userServiceProxy.getName(8));
        System.out.println(userServiceProxy.getAge(1));
    }

    */
/**
     * 测试CglibProxy
     *//*

    @Test
    public void getAge() {
        CglibProxy cglibProxy = new CglibProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);

        UserService o = (UserService)enhancer.create();
        o.getName(1);
        o.getAge(1);
    }

    */
/**
     * 测试线程
     *//*

    @Test
    public void MyThreadTest() throws InterruptedException {
        MyThread myThread1 = new MyThread();
        myThread1.start();
        myThread1.join();
        Thread.sleep(2000);
        System.out.println("线程1:"+ myThread1.hashCode());
        MyThread myThread2 = new MyThread();
        myThread2.start();
        myThread2.join();
        System.out.println("线程2:"+ myThread2.hashCode());
    }


    */
/**
     * 测试线程1
     *//*

    @Test
    public void Thread1Test(){
        Calculator calculator = new Calculator();
        //启动10个线程，分别计算结果
        for (int i=0;i<5;i++){
            new ReaderResult(calculator).start();
        }
       calculator.start();
    }

    */
/**
     * 测试类加载
     *//*

    public void ClassLoaderTest(){

    }
}*/
