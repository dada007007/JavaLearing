package com.itheima.d1_file;

import java.io.File;

public class FileTest5 {
    public static void main(String[] args) {
        // 拓展：修改文件名。
        // E:\磊哥面授\磊哥面授-昌平校区\基础入门课程\day04-数组、方法\视频
        // 1、定位该目录：创建File对象代表该目录。
        File f = new File("D:\\resource");

        // 2、提取这个目录下的全部一级文件对象。再想办法遍历，再改名称。
        File[] files = f.listFiles();

        for (File file : files) {
            // 3、每遍历到一个文件对象之后，应该修改这个文件对象的名称（满足我们的需求）
            String name = file.getName(); // name = 01、方法的其他形式  02、
            int index = (Integer.valueOf(name.substring(0, name.indexOf("、"))) + 32);

            String newName = index + name.substring(name.indexOf("、"));
            // 4、把这个新名称改给这个file
            file.renameTo(new File(file.getParent() , newName));
        }
    }
}
