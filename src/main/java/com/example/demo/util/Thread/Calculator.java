package com.example.demo.util.Thread;

/**
 * 总的线程类(计算线程)
 *
 * @author cui
 * @create 2018-05-26 16:15
 **/
public class Calculator extends Thread{
    int total;
    public void  run(){
        synchronized (this){
            for (int i=0;i<10;i++){
                total += i;
            }
        }
        //通知所有线程在此对象上等待线程
        notifyAll();
      // void.class.notifyAll();
    }
}
