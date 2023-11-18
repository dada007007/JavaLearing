package d1_char_stream;


import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) {
        // 目标：文件字符输入流的使用：每次读取多个字符。
        try (
                // 1、创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("day06-io-thread\\src\\dlei01.txt");
        ) {
            // 2、public int read(char[] buffer):
            //  每次读取字符数组这么多字符，返回每次读取了多少个字符。如果没有字符可读返回-1.
            char[] buffer = new char[3];
            int len; // 记录每次读取的字符个数。
            while ((len = fr.read(buffer)) != -1){
                String rs = new String(buffer, 0, len);
                System.out.print(rs);
            }
            // 拓展： 可以避免读取文本内容
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
