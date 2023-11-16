package com.itheima.d2_recursion;

import java.io.File;

public class test {
    public static void main(String[] args) throws Exception {
        // 目标：文件搜索。
        File dir = new File("D:/");
        searchFile(dir, "Wechat");
    }

    private static void searchFile(File dir, String wechat) {
        if (dir==null||dir.isFile()||!dir.exists()){
            System.out.println("这个目录不合法");
            return;
        }
        File[] files = dir.listFiles();
        for (File file : files) {

        }
    }


}
