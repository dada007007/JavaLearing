package com.itheima.d3_collection_test;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String number;
    private String color;
    // 每张牌是存在大小的
    private int size;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return color + number;
    }
}
