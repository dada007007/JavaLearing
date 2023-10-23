package com.itheima;

public class test {
    /*
    需求:
	    现有一个整数数组{100,50,90,60,80,70}。
	        请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
	                     总和 -  最大值 - 最小值
  平均值是 ===	        ---------------------
	                           长度-2
	        需要我们
	           求总和  求最大值   求最小值
	                  求长度
     */
    public static void main(String[] args) {
        //定义了一个数组
        int[] array = {100,50,90,60,80,70};
        // 求和
        // 循环前 定义求和变量
        int sum = 0;

        /*
          求最大值套路
            1: 假设第一个元素是最大值 定义一个接收最大值变量 max=数组[0]
            2: 做循环 循环可以从 第二个元素开始
               循环里面  每个元素跟max比较 如果比max大 max就存储当前元素
            3: 循环做完,比较完了，知道最大值
         */
        // 循环外  定义最大值max 假设为第一个元素
        int max = array[0];


        // 循环外  定义最小值min假设为第一个元素
        int min = array[0];
        // 做循环  循环 每个元素和min比较
        for (int i = 0; i < array.length; i++) {
            //求最小值
            if(array[i]<min){
                min = array[i];//每个元素跟min比较 如果比min小 min就存储当前元素
            }
            //求最大值
            if(array[i]>max){
                max = array[i];//每个元素跟max比较 如果比max大 max就存储当前元素
            }
            // 求和
            sum += array[i];
        }
        // 循环外就知道 最小值了
        System.out.println("最小值是:"+min);
        // 循环外就知道 最大值了
        System.out.println("最大值是:"+max);
        // 循环外 得到结果 那结果 做其他事
        System.out.println("sum:"+sum);//sum 求和的意思
        //求平均值
        int avg = (sum-max-min)/(array.length-2);

        System.out.println("最终平均值为:"+avg);

    }
}
