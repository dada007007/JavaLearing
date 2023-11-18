package d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonsDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握Commons-io包的使用。
        // 1、复制文件
        FileUtils.copyFile(new File("day06-io-thread\\src\\csb.txt"), new File("day06-io-thread\\src\\csb2.txt"));
//        FileUtils.copyDirectory(new File("E:\\resource\\秘密"), new File("E:\\resource\\aaa新密码"));
//        FileUtils.deleteDirectory(new File("E:\\resource\\秘密"));

        // 2、java也提供了一些新io技术，也可以一行代码完成复制。
        Files.copy(Path.of("day06-io-thread\\src\\dlei01.txt"), Path.of("day06-io-thread\\src\\dlei011111.txt"));
    }
}
