package d5_datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo2 {
    public static void main(String[] args) {
        // 目标：掌握数据输入流的使用。
        try (
                // 1、创建数据输入流包装低级的字节输入流
                DataInputStream dis = new DataInputStream(new FileInputStream("day06-io-thread/src/data.txt"));
                ){
                
            // 2、读数据和其类型。(必须与写的顺序一致)
            byte b1 = dis.readByte();
            int b2 = dis.readInt();
            String b3 = dis.readUTF();
            double b4 = dis.readDouble();

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
