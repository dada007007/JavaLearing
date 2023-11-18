package d5_datastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo1 {
    public static void main(String[] args) {
        // 目标：掌握数据输出流的使用。
        try (
                // 1、创建数据输出流对象
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day06-io-thread/src/data.txt"))
                ){

            // 2、开始写数据出去
            dos.writeByte(97);
            dos.writeInt(666);
            dos.writeUTF("我是特殊数据");
            dos.writeDouble(9.9);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
