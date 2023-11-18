package homework.answer4_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class test {
    // 以下代码运行后，文件a.txt中是否会有数据？为什么？
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter ps =  new PrintWriter(new FileOutputStream("D:\\code\\Javaee\\day06-io-thread\\src\\homework\\answer4_2\\a.txt"));
        ps.println("123");
        ps.print(666);
        ps.write(123);
        ps.close();
    }
}

