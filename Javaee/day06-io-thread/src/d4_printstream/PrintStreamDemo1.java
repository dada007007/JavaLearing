package d4_printstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("day06-io-thread/src/123.txt"));) {

            ps.println("你好");
            ps.println(123);
            ps.println('a');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
