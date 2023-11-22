package com.itheima.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：开发UDP客户端程序
        // 1、创建一个发送端对象（扔韭菜的人）
        DatagramSocket socket = new DatagramSocket(8888); // 默认自动分配端口

        // 2、创建一个数据包对象封装要发出去的数据（韭菜盘子）
         /*     public DatagramPacket(byte[] buf,  int length,
                     InetAddress address, int port)*/
        /**
         * 参数一：封装要发出去的数据（字节数组的形式）
         * 参数二：发出去的数据长度。
         * 参数三：服务端所在的主机IP
         * 参数四：服务端程序的端口号。
         */
        byte[] bytes = "原神，启动！".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.27.77"),
                6666);
        DatagramPacket packet2 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.27.69"),
                6666);
        // 3、把数据包发出去
        socket.send(packet);
        socket.send(packet2);

        System.out.println("发送端数据发送完毕！！");
        socket.close(); // 释放资源
    }
}
