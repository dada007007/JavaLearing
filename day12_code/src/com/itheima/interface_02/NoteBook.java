package com.itheima.interface_02;

public class NoteBook {
    public void useUSB(USB usb){
        System.out.println("插入USB设备");
        usb.input();
        usb.output();
        System.out.println("拔出USB设备");
    }
}
