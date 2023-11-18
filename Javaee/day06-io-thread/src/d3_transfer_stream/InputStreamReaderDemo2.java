package d3_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：字符输入转换流。
        try (InputStream is = new FileInputStream("day06-io-thread\\src\\gbk.txt");
             Reader isr = new InputStreamReader(is, "gbk");
             final BufferedReader br = new BufferedReader(isr);) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
