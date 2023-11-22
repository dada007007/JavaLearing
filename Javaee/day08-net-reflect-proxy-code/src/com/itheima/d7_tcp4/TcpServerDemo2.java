package com.itheima.d7_tcp4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpServerDemo2 {

    // 定义一个在线集合存储全部的在线socket管道。
    public static List<Socket> onLineSockets = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("=========服务端程序============");
            // 目标：服务端的开发。
            // 1、注册端口
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                // 2、监听客户端的链接请求，得到服务端socket
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress().getHostAddress() + "上线了~！");
                onLineSockets.add(socket);
                // 3、把这个客户端管道交给一个独立的子线程来处理。
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
