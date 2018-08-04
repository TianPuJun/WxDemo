package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    /**
     * base加密解密
     */
    @Test
    public void contextLoads() {
        String orig = "hello world!";
        String desc = Base64.getEncoder().encodeToString(orig.getBytes(StandardCharsets.UTF_8));
        System.out.println("加密后的字符串为:"+desc);
        String unDecodeStr=new String(Base64.getDecoder().decode(desc),StandardCharsets.UTF_8);
        System.out.println("解密后的字符串为"+unDecodeStr);
    }

    /**
     * 文件读取写入
     */
    @Test
    public void testBufferedInputOutputStream() {
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
