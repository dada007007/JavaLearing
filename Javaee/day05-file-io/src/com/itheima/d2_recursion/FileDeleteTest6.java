package com.itheima.d2_recursion;
/*需求：删除非空文件夹
分析：
①：File默认不可以删除非空文件夹
②：我们需要遍历文件夹，先删除里面的内容，再删除自己。*/

import java.io.File;

public class FileDeleteTest6 {
    public static void main(String[] args) {
        File dir = new File("D://123");
        deleteFile(dir);
    }

    private static void deleteFile(File dir) {
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()){
                    file.delete();
                }else{
                    deleteFile(file);
                }
            }
            dir.delete();
        }
    }
}
