package d6_object_serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableDemo2 {
    public static void main(String[] args) {
        // 目标：对象反序列化：把存储到文件中去的Java对象，恢复到程序中来
        try (
                // 1、创建对象字节输入流包装低级的字节输入流。
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day06-io-thread\\src\\obj.txt"));
        ){
            // 2、读取对象进来
            User u = (User) ois.readObject();
            System.out.println(u);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
