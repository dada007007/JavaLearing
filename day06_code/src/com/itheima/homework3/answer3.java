package com.itheima.homework3;
import java.util.Scanner;
public class answer3 {
        public static void main(String[] args) {
            //1.创建长度为6的int数组array,只能采用动态初始化(数组元素默认值都是0)
            int[] array = new int[6];

            //2.创建键盘录入Scanner类的对象
            Scanner sc = new Scanner(System.in);

            //3.获取键盘录入的6个0到100之间的整数数字,存储到int数组array中
            //______________1_____________

            for (int i = 0; i < array.length; i++) {
                int num = sc.nextInt();
                array[i] = num;
            }

            //4.定义int变量sum,初始值0,用来累加求和
            int sum = 0;
            //5.求数组元素和
            //______________2_____________
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.print("6个评委的评分:");
            //使用for循环遍历数组
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            //6.打印数组元素的和
            System.out.println("数组元素的和: "+sum);

            //7.假设索引0对应的元素是最大的,保存到int变量max中
            int max = array[0];

            //8.求最大值
            //______________3_____________
            for (int i = 1; i < array.length; i++) {
                if(max < array[i]){
                    max = array[i];
                }
            }

            //9.循环结束,打印最大值max
            System.out.println("数组元素最大值: "+max);

            //10.假设索引0对应的元素是最小的,保存到int变量min中
            int min = array[0];

            //11.求最小值
            //______________4_____________
            for (int i = 1; i < array.length; i++) {
                if(min > array[i]){
                    min = array[i];
                }
            }
            //12.循环结束,打印最大值min
            System.out.println("数组元素最小值: "+min);

            //13.根据需求计算平均值,保存到int变量avg中
            //______________5_____________
            int avg = 0;
            avg = (sum - max - min) / (array.length - 2);

            //14.打印avg的值
            System.out.println("按照规则,6个评委最终的平均分: "+avg);
        }


}
