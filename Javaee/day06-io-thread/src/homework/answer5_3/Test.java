package homework.answer5_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
// 项目根路径下有个questions.txt文件内容如下：
5+5
150-25
155*155
2555/5
// 要求：读取内容计算出结果，将结果写入到results.txt文件中
5+5=10
...
*/
public class Test {
    public static void main(String[] args) throws Exception {
        File f = new File("day06-io-thread\\src\\homework\\answer5_3\\questions.txt");
        Reader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        Writer bw = new BufferedWriter(new FileWriter("day06-io-thread\\src\\homework\\answer5_3\\result.txt", true));
        String line;
        List<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
//            String regex = "(\\d+)\\+(\\d+)";
//            Pattern pattern = Pattern.compile(regex);
//            Matcher matcher = pattern.matcher(line);
//            Integer num = Integer.valueOf(matcher.group(1));
//            Integer num2 = Integer.valueOf(matcher.group(2));
//            System.out.println("第一行内容"+(num+num2));
            list.add(line);
        }
        System.out.println(list);
        char c = 0;
        int position = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            char[] chars = s.toCharArray();
            for (int i1 = 0; i1 < chars.length; i1++) {//找运算符
                if (!(chars[i1] >= '0' && chars[i1] <= '9')) {
                    c = chars[i1];
                    position = i1;
                    break;
                }
            }
            String num1 = s.substring(0, position);
            String num2 = s.substring(position + 1);
            int n1 = Integer.valueOf(num1);
            int n2 = Integer.valueOf(num2);
            String s1 ;
            switch (c) {
                case '+':
                    s1 = num1 + "+" + num2 + "=" + (n1 + n2);
                    System.out.println(s1);
                    bw.write(s1);
                    bw.write("\r\n");
                    break;
                case '-':
                    s1 =num1 + "-" + num2 + "=" + (n1 - n2);
                    System.out.println(s1);
                    bw.write(s1);
                    bw.write("\r\n");
                    break;
                case '*':
                    s1 =num1 + "*" + num2 + "=" + (n1 * n2);
                    System.out.println(s1);
                    bw.write(s1);
                    bw.write("\r\n");
                    break;
                case '/':
                    s1 = num1 + "/" + num2 + "=" + (n1/ n2);
                    System.out.println(s1);
                    bw.write(s1);
                    bw.write("\r\n");
                    break;
            }



        }
        bw.close();
    }
}
