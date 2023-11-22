package com.itheima.d9_tcp6;

import java.io.PrintStream;
import java.net.Socket;
// 1、把给管道响应网页做成一个任务对象才能给线程池用。
public class ServerRunnable implements Runnable{
    private Socket socket;
    public ServerRunnable(Socket socket) {
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
            ps.println("<div style='color:green;font-size:60px'>原神，启动~~~~！！！</div>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(socket.getInetAddress().getHostAddress()
               + "下线了！");
        }
    }


}
