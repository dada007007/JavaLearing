package d2_buffer_stream;


import java.io.*;

public class BufferedInputStreamDemo1 {
    public static void main(String[] args) {
        // 目标：使用字节缓冲流提升原始字节流读写数据的性能的。
        try (
                // 只能放置资源对象，用完之后会自动调用其close方法释放资源
                // 1、创建文件字节输入流管道与源文件接通
                InputStream is = new FileInputStream("E:\\resource\\aaa.png");
                // 把低级的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                // 2、创建文件字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("D:\\meinv.png");
                // 把低级的字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 目标：try-with-resource
            // 3、准备一个字节数组转移数据
            byte[] buffer = new byte[1024]; // 1KB
            // 4、正式转移数据
            int len; // 记录每次读取的字节数量。
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len); // 读取多少倒出多少。
            }
            System.out.println("复制完成！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
