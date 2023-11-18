package homework.answer5_2;

import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

/*
实现一个验证程序运行次数的小程序，要求如下：
1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用
2.程序运行演示如下:
第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
1. 程序运行3次，每次运行结果不同，所以控制台打印的数字，应该在写文件中
2. 每次程序运行，读取文件中的数据，打印在控制台
3. 再将数据+1后重新写回文件
4. 每次读文件中的数据，需要判断数据是否超过3，超过3，则打印不同的结果
*/
public class Test {
    public static void main(String[] args) throws Exception {
        run();
        run();
        run();
        run();
        run();


    }

    public static void run() throws Exception {
        File f1 = new File("day06-io-thread\\src\\homework\\answer5_2\\log.txt");
        if (f1.exists()) {
            FileReader fr = new FileReader(f1);
            int num = fr.read();
            num++;
            if (num <= 3) {
                System.out.println("欢迎使用本软件,第" + num + "次使用免费~");
                PrintStream ps = new PrintStream("day06-io-thread\\src\\homework\\answer5_2\\log.txt");
                ps.write(num);
            }else {
                System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
            }
        } else {
            PrintStream ps = new PrintStream("day06-io-thread\\src\\homework\\answer5_2\\log.txt");
            System.out.println("欢迎使用本软件,第1次使用免费~");
            ps.write(1);
        }

    }

}
