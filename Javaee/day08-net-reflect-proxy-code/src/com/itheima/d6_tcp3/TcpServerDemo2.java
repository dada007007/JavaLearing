package com.itheima.d6_tcp3;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("=========服务端程序============");
            System.out.println("原神，启动！");
            // 目标：服务端的开发。
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                // 2、监听客户端的链接请求，得到服务端socket
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress().getHostAddress() + "上线了~！");
                // 3、把这个客户端管道交给一个独立的子线程来处理。
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
