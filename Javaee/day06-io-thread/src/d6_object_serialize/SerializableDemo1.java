package d6_object_serialize;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo1 {
    public static void main(String[] args) {
        // 目标：对象序列化：把Java对象存储到文件中去。
        User u1 = new User("dlei", "地雷", "zhangdan666", 23);
        try (
                // 1、创建对象字节输出流包装低级的字节输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day06-io-thread/src/obj.txt"));
                ){
            // 2、写对象出去
            oos.writeObject(u1);
            System.out.println("对象序列化完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
