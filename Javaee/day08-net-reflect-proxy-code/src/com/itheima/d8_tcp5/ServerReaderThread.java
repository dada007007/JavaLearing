package com.itheima.d8_tcp5;

import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 响应一个网页给 socket 管道。
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println(); // 必须换行
            ps.println("<div style='color:red;font-size:80px'>最牛逼的昌平就业班417~~~~！！！</div>");

            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(socket.getInetAddress().getHostAddress()
               + "下线了！");
        }
    }


}
