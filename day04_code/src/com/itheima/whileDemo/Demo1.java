package com.itheima.whileDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo1 {
    public static void main(String[] args) {

        double height = 8848860.0;
        double width = 0.1;
        int sum = 0;
        while (width < height) {
            width *= 2;
            sum += 1;
        }
        System.out.println(width);
        String paper_width = new BigDecimal(width)
                .setScale(2, RoundingMode.UP).toPlainString(); //科学计数法保留两位小数
        System.out.println("要折叠次数为： " + sum + "次");
        System.out.println("纸的厚度是： " + paper_width);


    }
}
