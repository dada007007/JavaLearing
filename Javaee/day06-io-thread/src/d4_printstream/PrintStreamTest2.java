package d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest2 {
    public static void main(String[] args) {
        // 目标：输出语句的重定向。
        System.out.println("这个叫我这样干");
        System.out.println("那个叫我那样干");

        try (// 写一个打印流
             PrintStream ps = new PrintStream("day06-io-thread/src/log.txt");) {
            System.setOut(ps); // 重定向了
            System.out.println("其实都是瞎扯淡");
            System.out.println("全都是混蛋");
            System.out.println("全都是混蛋");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
