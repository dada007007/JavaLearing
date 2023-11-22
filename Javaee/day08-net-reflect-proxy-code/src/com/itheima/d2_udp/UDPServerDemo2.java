package com.itheima.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("===服务端启动成功====");
        // 目标：掌握UDP通信，服务端的开发。
        // 1、创建接收端对象（接韭菜的人）,注册端口
        DatagramSocket socket = new DatagramSocket(6666);

        // 2、创建一个数据包对象接数据（接韭菜的盘子）
        byte[] buffer = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 3、开始正式接收数据
        socket.receive(packet);

        // 4、把数据转出来
        // 读取多少就倒出多少。
        int len = packet.getLength();
        String rs = new String(buffer,0, len);
        System.out.println("服务端收到信息如下：");
        System.out.println(rs);

        // 5、获取客户端的ip
        String ip = packet.getAddress().getHostAddress();
        System.out.println("对方IP:" + ip);

        System.out.println("对方端口：" + packet.getPort());

        socket.close();
    }
}
