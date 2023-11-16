package com.itheima.d4_byte_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) throws Exception {
        // 目标：文件字节输出流的使用。
        // 1、创建一个文件字节输出流管道与目标文件接通。
        // OutputStream os = new FileOutputStream("day08-stream-file-io/src/dlei06out.txt"); // 覆盖管道
        OutputStream os =
                new FileOutputStream("day08-stream-file-io/src/dlei06out.txt", true); // 追加管道

        // 2、开始写字节数据出去。
        // public void write(int a): 每次写出去一个字节 。
        os.write(97);
        os.write('a');
        // os.write('徐');  // 默认写出去第一个字节，所以会乱码！
        os.write("\r\n".getBytes()); // 换行

        // public void write(byte[] buffer): 每次写一个字节数组的数据出去。
        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes()); // 换行

        // public void write(byte[] buffer, int pos, int len): 写一个字节数组的一部分出去。
        // 参数一：字节数组
        // 参数二：写出去的第一个字节的索引
        // 参数三：总共写出去多少个字节
        byte[] bytes2 = "我爱你中国abc".getBytes();
        os.write(bytes2, 0, 9);
        os.write("\r\n".getBytes()); // 换行

        // 关闭资源！
        os.close();
    }
}
