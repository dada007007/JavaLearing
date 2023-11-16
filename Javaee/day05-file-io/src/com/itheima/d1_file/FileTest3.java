package com.itheima.d1_file;

import java.io.File;

/**
 * 目标：掌握File创建和删除文件相关的方法。
 */
public class FileTest3 {
    public static void main(String[] args) throws Exception {
        // 1、public boolean createNewFile()：创建一个新文件（文件内容为空），创建成功返回true,反之。(没啥用)
        File f1 = new File("day05-file-io/src/dlei02.txt");
        System.out.println(f1.createNewFile());

        // 2、public boolean mkdir()：用于创建文件夹，注意：只能创建一级文件夹
        File f2 = new File("D:/resource/aaabbbcccddd");
        System.out.println(f2.mkdir());

        File f3 = new File("D:/resource/aaa2/ccc/ddd/eee/fff");
        System.out.println(f3.mkdir()); // 注意：只能创建一级文件夹

        // 3、public boolean mkdirs()(重点)：用于创建文件夹，注意：可以创建多级文件夹
        File f4 = new File("D:/resource/aaa3/ccc/ddd/eee/fff");
        System.out.println(f4.mkdirs());

        // 4、public boolean delete()：只能删除文件，或者空文件，注意：不能删除非空文件夹。
        // System.out.println(f1.delete());
        File f5 = new File("D:\\resource\\aaabbbcccddd");
        System.out.println(f5.delete());
    }
}
