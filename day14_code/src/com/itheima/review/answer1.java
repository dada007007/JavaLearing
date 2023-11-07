package com.itheima.review;

/*
需求:
定义一个方法getCount，该方法接收一个int数组,方法内部计算并返回数组中元素值小于数组平均值的个数
1：在main方法中创建长度为7的int数组,
2：存储7个20到80(包含20,包含80)int数字,存储到数组中
3：在main方法中 调用getCount方法,传递数组,获取结果并打印
*/
public class answer1 {
    public static void main(String[] args) {
        int[] a = {20, 30, 40, 50, 60, 70, 80};
        System.out.println("数组中小于数组平均值的个数为：" + getCount(a));
    }

    public static int getCount(int[] a) {
        int ave = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            ave += a[i];
        }
        ave = ave / a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < ave) {
                count++;
            }
        }
        return count;
    }
}
