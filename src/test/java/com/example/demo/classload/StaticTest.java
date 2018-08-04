package com.example.demo.classload;

import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试  类加载顺序
 *
 * @author cui
 * @create 2018-05-29 13:55
 **/
public class StaticTest {


    public static void main(String[] args)
        {
            staticFunction();

        }

        static StaticTest st = new StaticTest();

        static
        {
            System.out.println("1");
        }

        {
            System.out.println("2");
        }

        StaticTest()
        {
            System.out.println("3");
            System.out.println("a="+a+",b="+b);
        }

        public static void staticFunction(){
            System.out.println("4");
        }

        int a=110;
         static int b =112;

}
