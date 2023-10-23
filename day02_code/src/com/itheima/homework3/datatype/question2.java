package com.itheima.homework3.datatype;

public class question2 {
    public static void main(String[] args) {
/*      请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
        1、班级里有100个学员。
        2、某商品价格55.55元。
        3、地球已经诞生超过46亿年。
        4、“5是偶数”这句话的描述是假的。*/
        int stu = 100;
        double price = 55.55;
        long year = 4600000000L;

        System.out.println(stu);
        System.out.println(price);
        System.out.println(year);

        if (5 % 2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        boolean y = (5 % 2 == 0) ? true :false;
        System.out.println(y);
    }
}
