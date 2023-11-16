package com.itheima.homework.answer4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 以下代码，运行后会有问题吗？为什么？文件中会有什么数据？
// 文件abc.txt已有数据：中国你好！
public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\abc.txt");
        FileOutputStream fos = new FileOutputStream("d:\\abc.txt",true);
        int len;
        int read = fis.read();
        System.out.println(read);
        System.out.println(fis.read());
        fis.close();
        fos.close();
    }
}
