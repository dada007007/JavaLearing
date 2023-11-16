package com.itheima.d1_file;


import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
     目标：掌握File提供的判断文件类型、获取文件信息功能
 */
public class FileTest2 {
    public static void main(String[] args) {
        // 1.创建文件对象，指代某个文件
         File f1 = new File("D:/1.txt");
        // File f1 = new File("day05-file-io\\src\\dlei01.txt");
//         File f1 = new File("E:/resource");

        // 2、public boolean exists()：判断当前文件对象，对应的文件路径是否存在，存在返回true.
        System.out.println(f1.exists());

        // 3、public boolean isFile() : 判断当前文件对象指代的是否是文件，是文件返回true，反之。
        System.out.println(f1.isFile());

        // 4、public boolean isDirectory()  : 判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之。
        System.out.println(f1.isDirectory());

        // 5.public String getName()：获取文件的名称（包含后缀）
        System.out.println(f1.getName());

        // 6.public long length()：获取文件的大小，返回字节个数
        System.out.println(f1.length());

        // 7.public long lastModified()：获取文件的最后修改时间。(时间毫秒值)
        long time = f1.lastModified();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(Instant.ofEpochMilli(time));
        Instant instant = Instant.ofEpochMilli(time);
        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
//        System.out.println(dtf.format(Instant.ofEpochMilli(time)));
        System.out.println(zdt);
        String result = dtf.format(zdt);
        System.out.println(result);


        // 8.public String getPath()：获取创建文件对象时，使用的路径
        System.out.println(f1.getPath());

        // 9.public String getAbsolutePath()：获取绝对路径.
        System.out.println(f1.getAbsolutePath());
    }
}
