package d1_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        // 目标：文件字符输入流的使用：每次读取一个字符。
        try (
                // 1、创建一个文件字符输入流管道与源文件接通
                Reader fr = new FileReader("day06-io-thread\\src\\dlei01.txt");
                ) {
            // 2、每次读取一个字符 ： public int read(): 每次读取一个字符编号，没有字符可读返回-1
            int c; // 每次记住字符的。
            while ((c = fr.read()) != -1){
                System.out.print((char) c);
            }
            // 优点： 可以避免读取乱码。性能差！
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
