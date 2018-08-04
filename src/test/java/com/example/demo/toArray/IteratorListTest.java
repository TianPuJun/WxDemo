package com.example.demo.toArray;

import java.util.*;

/**
 * 迭代器测试集合
 *
 * @author cui
 * @create 2018-05-30 13:53
 **/
public class IteratorListTest {
    public static void main(String[] args){
        /**
         * 迭代器集合
         */
        /*List l = new ArrayList();
        l.add("111");
        l.add("222");
        l.add("333");
        l.add("444");
        l.add("555");
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            //System.out.println("迭代器循环："+iterator.next());
            String item = iterator.next();
            if ("111".equals(item)){
                iterator.remove();
            }
        }
        Iterator<String> it = l.iterator();
        while (it.hasNext()){
             System.out.println("移除之后："+it.next());
        }*/

        /**
         * map
         *
         */
        Map<String,String> m = new HashMap<>();
        m.put("A","10");
        m.put("B","20");
        m.put("C","30");
        m.put("D","40");
        m.put("E","50");
        //m.forEach((k,v) -> System.out.println("Item:"+k+":"+"value:"+v));
        m.forEach((k,v)->{
            System.out.println("Item:"+k+":"+"value:"+v);
            if ("E".equals(k)){
                System.out.println("Hello E");
            }
        });

    }

}
