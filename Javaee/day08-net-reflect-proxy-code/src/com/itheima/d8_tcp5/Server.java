package com.itheima.d8_tcp5;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 目标：开发网站服务端程序，体会Java网站开发本质原理。
        // 1、注册端口
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            // 2、监听浏览器请求的管道链接。
            Socket socket = serverSocket.accept();
            // 3、交给一个独立的线程负责为这个管道响应一个网页回去。
            new ServerReaderThread(socket).start();
        }
    }
}
