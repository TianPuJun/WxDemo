package com.example.demo.toArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合转数组测试类
 *
 * @author cui
 * @create 2018-05-30 13:32
 **/
public class toArrayTest {
    public static void main(String[] args)
    {
        List a = new ArrayList();
        a.add("aaa");
        a.add("bbb");
        String[] b = new String[a.size()];
        b= (String[]) a.toArray(b);
        for (Object t:a
             ) {
            System.out.println("集合："+t.toString());
        }

        for (String c:b
                ) {
            System.out.println(c.toString());
        }

    }


}
