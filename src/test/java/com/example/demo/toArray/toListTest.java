package com.example.demo.toArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 数组转集合
 *
 * @author cui
 * @create 2018-05-30 13:40
 **/
public class toListTest {
    public static void main(String[] args){
        String[] str = new String[] {"you","we","our"};
        List list = Arrays.asList(str);
        for (Object l:list
             ) {
            System.out.println("foreach循环集合："+l.toString());
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("迭代器循环：" + iterator.next());
        }
    }
}
