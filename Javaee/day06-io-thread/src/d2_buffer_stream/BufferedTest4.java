package d2_buffer_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest4 {
    public static void main(String[] args) {
        try (
                // 1、创建 缓冲字符输入流与源文件接通。
                BufferedReader br = new BufferedReader(new FileReader("day06-io-thread\\src\\csb.txt"));
                // 5、遍历集合中的每段内容，写出到一个新文件中即可。
                BufferedWriter bw = new BufferedWriter(new FileWriter("day06-io-thread/src/new.txt"));
                ){

            // 2、创建一个集合容器用于到时候装每段内容。
            List<String> data = new ArrayList<>();

            // 3、按照行读取数据
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            System.out.println(data);

            // 4、给集合中的每个元素按照首字母数字排序。
            Collections.sort(data);
            System.out.println(data);

            for (String ln : data) {
                bw.write(ln);
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
