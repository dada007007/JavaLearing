package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：开发UDP客户端程序
        // 1、创建一个发送端对象（扔韭菜的人）
        DatagramSocket socket = new DatagramSocket(); // 默认自动分配端口

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();

            if("exit".equals(msg)) {
                System.out.println("退出成功！");
                socket.close(); // 释放资源
                break;
            }
            // 2、创建一个数据包对象封装要发出去的数据（韭菜盘子）
            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),
                    6666);

            // 3、把数据包发出去
            socket.send(packet);
        }
    }
}
