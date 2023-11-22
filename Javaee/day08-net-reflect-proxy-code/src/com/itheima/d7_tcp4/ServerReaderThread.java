package com.itheima.d7_tcp4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
                // 把这个消息转发给当前在线的全部socket管道接收。
                sendMsgToAll(msg);
                System.out.println("--------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(socket.getInetAddress().getHostAddress()
               + "下线了！");
        }
    }

    private void sendMsgToAll(String msg) throws Exception {
        // 遍历在线集合的每个socket，把消息推给人家
        for (Socket onLineSocket : TcpServerDemo2.onLineSockets) {
            // 这个管道不能是自己，就应该发消息给他。
            if(onLineSocket != socket) {
                DataOutputStream dos = new DataOutputStream( onLineSocket.getOutputStream() );
                dos.writeUTF(msg);
                dos.flush(); // 刷出去消息。
            }
        }
    }
}
