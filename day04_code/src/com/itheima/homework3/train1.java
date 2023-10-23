package com.itheima.homework3;
/*有一个输出语句System.out.print("@")。使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
	@@@@@
	@@@@@
	@@@@@
	@@@@@
*/
public class train1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
