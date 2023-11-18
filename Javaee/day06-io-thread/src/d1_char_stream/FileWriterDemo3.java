package d1_char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo3 {
    public static void main(String[] args) {
        try (
                // 目标：掌握文件字符输出流的使用。
                // 1、创建一个文件字符输出流管道与目标文件接通
                // Writer fw = new FileWriter("day06-io-thread/src/dlei02-out.txt"); // 覆盖管道
                Writer fw = new FileWriter("day06-io-thread/src/dlei02-out.txt", true); // 追加管道
        ) {
            // 2、写字符数据出去。
            // a.写一个字符出去 : public void write(int c)
            fw.write('a');
            fw.write('徐');
            fw.write(97);
            fw.write(22859);
            fw.write("\r\n"); // 换行

            // b.写一个字符串出去：public void write(String s)
            fw.write("我爱你中国abc");
            fw.write("\r\n");

            // c、写字符串的一部分出去 ： public void write(String s， int pos ,int len)
            fw.write("我爱你中国abc", 0 , 5);
            fw.write("\r\n");

            // d.写一个字符数组出去：public void write(char[] chars)
            char[] chars = "我爱你台湾abc".toCharArray();
            fw.write(chars);
            fw.write("\r\n");

            // e、写一个字符数组的一部分出去：public void write(char[] chars， int pos ,int len)
            fw.write(chars, 3, 2);
            fw.write("\r\n");

//            fw.flush(); // 刷新数据到文件，流可以继续使用。
//            fw.close(); // 包含了刷新数据，但是流不能再继续使用了。

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
