package com.itheima.arrays_sort;

import java.util.Arrays;

public class ArraysTest{
    public static void main(String[] args) {

        int[] arr1= {3,4,2,1,7,9};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        double[] arr2= {3.5,4.1,2.5,1.45,7.48,9.18};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        String[] arr3= {"文龙","文选","WCBA","QBA"};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //int数组 double数组 String数组 都可以完成排序
        Student stu1 = new Student("文龙",19);
        Student stu2 = new Student("文轩",18);
        Student stu3 = new Student("少龙",21);
        Student stu4 = new Student("思杰",20);


        //新建一个数组
        Student[] stuArr = {stu1,stu2,stu3,stu4};
        // 来排序
        Arrays.sort(stuArr);
        for (int i = 0; i < stuArr.length; i++) {
            System.out.println(stuArr[i]);
        }

    }


}
