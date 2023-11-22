package com.itheima.d1_net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());

        Inet4Address ip2 = (Inet4Address) Inet4Address.getLocalHost();
        System.out.println(ip2.getHostAddress());
        System.out.println(ip2.getHostName());
        Inet6Address ip3 = (Inet6Address) Inet6Address.getLocalHost();
        System.out.println(ip3.getHostAddress());
        System.out.println(ip3.getHostName());
    }
}
