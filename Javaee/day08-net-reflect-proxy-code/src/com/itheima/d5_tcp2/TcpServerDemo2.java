package com.itheima.d5_tcp2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("=========服务端程序============");
            // 目标：服务端的开发。
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(9999);
            // 2、监听客户端的链接请求，得到服务端socket
            Socket socket = serverSocket.accept();
            System.out.println("有人上线了~~~");
            // 3、从服务端中获取一个字节输入流。
            InputStream is = socket.getInputStream();
            // 4、把字节输入流包装成数据输入流
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                // 5、读数据
                String msg = dis.readUTF();

                System.out.println("服务端收到了：");
                System.out.println(msg);

                System.out.println("对方IP:"
                  + socket.getInetAddress().getHostAddress());
                System.out.println("对方端口:"
                        + socket.getPort());
            }
        } catch (Exception e) {
            System.out.println("有人下线了");
        }
    }
}
