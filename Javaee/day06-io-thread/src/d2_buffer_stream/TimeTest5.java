package d2_buffer_stream;

import java.io.*;

public class TimeTest5 {
    public static final String SRC_VIDEO = "C:\\Users\\dldl6\\Desktop\\黑马黄埔班基础进阶阶段中期考试试卷\\视频\\04、第四题.avi";
    public static final String DEST_FILE = "E:\\磊哥面授\\磊哥面授-黄埔二期\\";

    public static void main(String[] args) {
        // 1、使用低级的字节流按照一个一个字节的形式复制文件: 简直慢的让人无法忍受，直接淘汰，禁止使用。
        // copy01();

        // 2、使用低级的字节流按照字节数组的形式复制文件: 速度还行，还是有点慢
        copy02();

        // 3、使用高级的缓冲字节流按照一个一个字节的形式复制文件： 非常慢，也是不能忍受的！
        // copy03();

        // 4、使用高级的缓冲字节流按照字节数组的形式复制文件：非常的快！最优方案。
        copy04();
    }

    /**
     * 4、使用高级的缓冲字节流按照字节数组的形式复制文件。
     */
    public static void copy04(){
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_VIDEO);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE + "4.avi");
                OutputStream bos = new BufferedOutputStream(os);
        ){
            byte[] buffer = new byte[1024 * 32];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0 , len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照字节数组的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    /**
     *  3、使用高级的缓冲字节流按照一个一个字节的形式复制文件。
     */
    public static void copy03(){
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_VIDEO);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE + "3.avi");
                OutputStream bos = new BufferedOutputStream(os);
        ){
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用高级的缓冲字节流按照一个一个字节的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    /**
     *  2、使用低级的字节流按照字节数组的形式复制文件。
     */
    public static void copy02(){
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_VIDEO);
                OutputStream os = new FileOutputStream(DEST_FILE + "2.avi");
        ){
            byte[] buffer = new byte[1024 * 32];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0 , len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照字节数组的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    /**
     *  1、使用低级的字节流按照一个一个字节的形式复制文件。
     */
    public static void copy01(){
        long start = System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_VIDEO);
                OutputStream os = new FileOutputStream(DEST_FILE + "1.avi");
                ){
            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }
}
