package com.itheima.d2_recursion;

import java.io.File;

public class test2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("D://");
        searchFile(dir, "Wechat");
    }

    private static void searchFile(File dir, String name) {
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.getName().contains(name)) {
                    System.out.println(file.getAbsoluteFile());
                }else {
                    searchFile(file,name);
                }
            }
        }

    }


}
