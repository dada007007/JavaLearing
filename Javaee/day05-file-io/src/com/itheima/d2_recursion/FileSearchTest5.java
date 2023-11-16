package com.itheima.d2_recursion;

import java.io.File;

public class FileSearchTest5 {
    public static void main(String[] args) throws Exception {
        // 目标：文件搜索。
        File dir = new File("D:/");
        searchFile(dir, "Wechat");
    }

    /**
     * 文件搜索
     * @param dir 要搜索的目录（文件夹）
     * @param fileName 要搜索的文件名称
     */
    private static void searchFile(File dir, String fileName) throws Exception {
        if(dir == null || !dir.exists() || dir.isFile()) {
            return; // 不进行搜索了！条件不符合
        }
        // 1、用户思维和线性思维。
        // 2、提取这个目录下的全部一级文件对象。
        File[] files = dir.listFiles();
        // 3、判断是否有权限拿一级文件对象, 以及当前目录下是否存在一级文件对象，
        if(files != null && files.length > 0) {
            // 4、遍历一级文件对象数组，看是否是自己想要的文件。
            for (File file : files) {
                // 5、判断当前遍历到的一级文件对象是文件还是文件夹。
                if(file.isFile()) {
                    // 6、是文件：判断这个文件名是不是我正在找的。
                    if(file.getName().contains(fileName)){
                        System.out.println("找到了：" + file.getAbsolutePath());
//                        Runtime r = Runtime.getRuntime();
//                        r.exec(file.getAbsolutePath());
                    }
                }else {
                    // 文件夹：继续递归去当前这个文件夹中继续搜索 fileName
                    searchFile(file, fileName);
                }
            }
        }
    }

}
