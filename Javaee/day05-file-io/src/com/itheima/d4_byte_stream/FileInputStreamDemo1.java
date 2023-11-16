package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("day05-file-io\\src\\dlei02.txt");
        int b ;
        while ((b=is.read())!=-1){
            System.out.print((char)b);
        }
    }
}
