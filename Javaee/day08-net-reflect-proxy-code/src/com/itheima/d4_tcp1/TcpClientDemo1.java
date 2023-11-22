package com.itheima.d4_tcp1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：客户端开发。
        // 1、创建一个Socket通信管道与服务端建立可靠链接
        Socket socket = new Socket("127.0.0.1", 9999);
        // 2、从socket通信管道中得到一个字节输出流。
        OutputStream os = socket.getOutputStream();
        // 3、把字节输出流包装成一个数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        // 4、写数据出去
        dos.writeInt(666);
        dos.writeUTF("我是客户端，我发来消息请求，请问我们可以在一起不？？？？ ");
        dos.flush();
        // 5、关闭资源
        socket.close();
    }
}
