/*
package com.example.demo.proxy;

import com.example.demo.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

*/
/**
 * JDK动态代理
 *
 * @author cui
 * @create 2018-05-17 15:10
 **//*

public class jdkProxy  implements InvocationHandler {
    private Object target; //我们既然要做代理，我们必须知道我们是给谁做代理，这里的obj就是被代理者。
    private UserService u;
    public jdkProxy(){
        super();
    }

    public jdkProxy(Object target) {
        this.target = target;
    }

    */
/**
     * 然后是invoke的三个参数、
     * 第一个参数就是代理者，如果你想对代理者做一些操作可以使用这个参数
     * 二个就是被执行的方法，第三个是执行该方法所需的参数。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     *//*

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //把我们想要通过代理者给被代理者===追加====的操作都写在invoke方法里面
        if("getName".equals(method.getName())){
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(target, args);
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        }else{
            System.out.println("++++++before111 " + method.getName() + "++++++");
            Object result = method.invoke(target, args);
            return result;
        }
    }
}
*/
