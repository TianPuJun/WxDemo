/*
package com.example.demo.util;

import java.io.*;

*/
/**
 * 文件流读取写入
 *
 * @author cui
 * @create 2018-05-24 15:32
 **//*


public class FileTest {

    public static void testBufferedInputOutputStream(){
        try {
            String inputFileName = "E:\\1\\file1.txt";
            String outputFileName = "E:\\1\\file2.txt";
            FileInputStream fis = new FileInputStream(inputFileName);
            BufferedInputStream bis = new BufferedInputStream(fis,1024*10);
            FileOutputStream fos = new FileOutputStream(outputFileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos,1024*10);
            byte[] buf = new byte[1024];
            int length =0;
            while ((length = bis.read(buf))>0){
                bos.write(buf,0,length);
            }
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
