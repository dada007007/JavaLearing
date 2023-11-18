package d2_buffer_stream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo2 {
    public static void main(String[] args) {
        // 目标：字符缓冲输入流的使用：提升原始字符输入流的读字符性能，多了按照行读取的能力。
        try (
                // 1、创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("day06-io-thread\\src\\dlei03.txt");
                // 把低级的字符输入流包装成高级的缓冲字符输入流。
                BufferedReader bw = new BufferedReader(fr);
        ) {

            // 2、public int read(char[] buffer):
            //  每次读取字符数组这么多字符，返回每次读取了多少个字符。如果没有字符可读返回-1.
//            char[] buffer = new char[1024];
//            int len; // 记录每次读取的字符个数。
//            while ((len = bw.read(buffer)) != -1){
//                String rs = new String(buffer, 0, len);
//                System.out.print(rs);
//            }

//            System.out.println(bw.readLine());
//            System.out.println(bw.readLine());
//            System.out.println(bw.readLine());
//            System.out.println(bw.readLine());
//            System.out.println(bw.readLine());
//            System.out.println(bw.readLine());
//            System.out.println(bw.readLine());

            // 3、使用循环改进
            String line; // 记住读取的一行数据
            while ((line = bw.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
