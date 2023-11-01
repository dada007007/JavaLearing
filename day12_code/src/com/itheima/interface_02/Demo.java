package com.itheima.interface_02;

public class Demo {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();

        USB uPan = new UPan();
        noteBook.useUSB(uPan);

    }
}
