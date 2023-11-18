package d2_buffer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo3 {
    public static void main(String[] args) {
        try (
                // 目标：掌握缓冲字符输出流的使用。
                // 1、创建一个文件字符输出流管道与目标文件接通
                // Writer fw = new FileWriter("day06-io-thread/src/dlei04-out.txt"); // 覆盖管道
                Writer fw = new FileWriter("day06-io-thread/src/dlei04-out.txt", true); // 追加管道
                // 把低级的字符输出流包装成高级的缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            // 2、写字符数据出去。
            // a.写一个字符出去 : public void write(int c)
            bw.write('a');
            bw.write('徐');
            bw.write(97);
            bw.write(22859);
            bw.newLine(); // 换行

            // b.写一个字符串出去：public void write(String s)
            bw.write("我爱你中国abc");
            bw.newLine(); // 换行

            // c、写字符串的一部分出去 ： public void write(String s， int pos ,int len)
            bw.write("我爱你中国abc", 0 , 5);
            bw.newLine(); // 换行

            // d.写一个字符数组出去：public void write(char[] chars)
            char[] chars = "我爱你台湾abc".toCharArray();
            bw.write(chars);
            bw.newLine(); // 换行

            // e、写一个字符数组的一部分出去：public void write(char[] chars， int pos ,int len)
            bw.write(chars, 3, 2);
            bw.newLine(); // 换行

//            fw.flush(); // 刷新数据到文件，流可以继续使用。
//            fw.close(); // 包含了刷新数据，但是流不能再继续使用了。

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
