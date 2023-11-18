package homework.answer5_1;

import java.io.*;

/*
编写一个程序，把一个目录里边的所有带.java文件拷贝到另一个目录中，拷贝成功后，把后缀名是.java的文件改为.txt文件。
（注意事项：是先拷贝，拷贝成功后才可以改后缀名的）
**实现提示**：
1. 用File对象封装目录
2. 通过listFiles()方法获取该目录下所有的文件或者文件夹的File对象数组
3. 遍历这个File数组，得到每一个File对象
4. 判断该File对象是否是文件
- 如果是文件
- 继续判断是否以.java结尾
- 是：复制文件，再复制完成后改名
- 否：不复制
*/
public class Test {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\字符输入输出流作业\\answer5_1\\被拷贝文件夹");
        File f2 = new File("D:\\字符输入输出流作业\\answer5_1\\目的文件夹");
        search(f1, f2);
    }

    public static File search(File f1, File f2) throws Exception {
        for (File file : f1.listFiles()) {
            if (file.isFile()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                if (file.getName().endsWith(".java")) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(f2, file.getName())));
                    System.out.println(file.getAbsoluteFile());
                    int line;
                    while ((line = br.read()) != -1) {
                        bw.write(line);
                    }
                    bw.close();
                    br.close();
                }
            } else {
                return search(file, f2);
            }
        }
        final File[] files = f2.listFiles();
        for (File file : files) {
            file.renameTo(new File(file.getAbsolutePath().replace(".java", ".txt")));
        }
        return null;
    }
}
