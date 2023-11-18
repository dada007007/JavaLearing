package homework.answer4_3;

import java.io.*;

// 以下代码运行后，country变量是否会有数据呢？


public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1、创建一个Java对象。
        User.setCountry("中国");
        User u = new User("张三", 32, "666888xyz");
        // 2、创建一个对象字节输出流包装原始的字节 输出流。
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("D:\\code\\Javaee\\day06-io-thread\\src\\homework\\answer4_3\\itheima11out.txt"));

        // 3、序列化对象到文件中去
        oos.writeObject(u);
        oos.close();

        // 下面反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\code\\Javaee\\day06-io-thread\\src\\homework\\answer4_3\\itheima11out.txt"));

        User u1 = (User) ois.readObject();
        // 请问打印出来的User对象中，是否有country的值？？？
        System.out.println(u1);
        ois.close();
    }
}