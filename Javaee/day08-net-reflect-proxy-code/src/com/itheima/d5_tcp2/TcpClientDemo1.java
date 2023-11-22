package com.itheima.d5_tcp2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientDemo1 {
    public static void main(String[] args) throws Exception {

        // 目标：客户端开发: 多发多收
        // 1、创建一个Socket通信管道与服务端建立可靠链接
        Socket socket = new Socket("127.0.0.1", 9999);
        // 2、从socket通信管道中得到一个字节输出流。
        OutputStream os = socket.getOutputStream();
        // 3、把字节输出流包装成一个数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            if("exit".equals(msg)) {
                System.out.println("退出成功！~");
                socket.close();
                break;
            }

            // 4、写数据出去
            dos.writeUTF(msg);
            dos.flush();
        }

    }
}
