package com.itheima.d6_tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket) {
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
                System.out.println(socket.getInetAddress().getHostAddress() + " 说：" + msg);
                System.out.println("--------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(socket.getInetAddress().getHostAddress()
               + "下线了！");
        }
    }
}
