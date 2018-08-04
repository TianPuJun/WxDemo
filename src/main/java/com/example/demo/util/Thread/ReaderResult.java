package com.example.demo.util.Thread;

/**
 * 线程1
 *
 * @author cui
 * @create 2018-05-26 16:12
 **/
public class ReaderResult extends Thread {
    Calculator c;
    public ReaderResult(Calculator c){
        this.c=c;
    }
    public void run() {
       synchronized (c){
           try {
               System.out.println(Thread.currentThread()+"等待计算结果。。。。");
               c.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(Thread.currentThread()+"计算结果为 ："+c.total);
       }
    }
}
