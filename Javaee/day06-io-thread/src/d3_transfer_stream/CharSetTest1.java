package d3_transfer_stream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class CharSetTest1 {
    public static void main(String[] args) {
        // 目标：不同编码下，字符流读取文本内容的问题。
        try (
                // 1、创建一个文件字符输入流与源文件接通
                // Reader fr = new FileReader("day06-io-thread\\src\\dlei03.txt"); // 代码UTF-8  文件UTF-8
                Reader fr = new FileReader("day06-io-thread\\src\\gbk.txt"); // 代码UTF-8  文件GBK
                // 把低级的字符输入流包装成高级的缓冲字符输入流。
                BufferedReader bw = new BufferedReader(fr);
        ) {
            // 2、使用循环改进
            String line; // 记住读取的一行数据
            while ((line = bw.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
