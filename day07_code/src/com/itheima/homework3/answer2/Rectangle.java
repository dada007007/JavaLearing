package com.itheima.homework3.answer2;
/*属性：
        长(length):int length
        宽(width): int width

        方法：
        方法一用于求矩形的面积: 长 * 宽
        void area(): 方法内部直接打印该矩形的面积

        方法二用于求矩形的周长: (长 + 宽) * 2
        void size(): 方法内部直接打印该矩形的周长

        要求:
        1.成员变量private修饰,提供get/set方法,空参满参构造
        2.运行效果通过两种方式实现
        (1)空参构造创建对象,set方法赋值
        (2)满参构造直接创建对象

        在测试类中通过对象完成成员变量和成员方法的使用
        运行效果:
        长为: 8, 宽为: 6 的矩形的面积为: 48
        长为: 8, 宽为: 6 的矩形的周长为: 28*/
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public Rectangle(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return (this.length + this.width) * 2;
    }
}
