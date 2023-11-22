package com.itheima.d9_tcp6;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws Exception {
        // 目标：开发网站服务端程序，体会Java网站开发本质原理。
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 5, TimeUnit.SECONDS
        , new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        // 1、注册端口
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            // 2、监听浏览器请求的管道链接。
            Socket socket = serverSocket.accept();
            // 把这个管道包装成一个任务对象，交给线程池排队
            pool.execute(new ServerRunnable(socket));
        }
    }
}
