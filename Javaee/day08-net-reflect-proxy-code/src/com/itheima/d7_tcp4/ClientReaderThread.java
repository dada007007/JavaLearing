package com.itheima.d7_tcp4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 3、从服务端中获取一个字节输入流。
            InputStream is = socket.getInputStream();
            // 4、把字节输入流包装成数据输入流
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                // 5、读数据
                String msg = dis.readUTF();
                // 把这个消息转发给当前在线的全部socket管道接收。
                System.out.println("收到：" + msg);
                System.out.println("--------------------------------------");
            }
        } catch (Exception e) {
            System.out.println("客户端完成正常退出！");
        }
    }


}
