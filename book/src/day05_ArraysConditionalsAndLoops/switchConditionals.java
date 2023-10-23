package day05_ArraysConditionalsAndLoops;

import java.util.Scanner;

//switch switch用于对于确切值的选择判断
public class switchConditionals {
    public static void main(String[] args) {
        String oper = new Scanner(System.in).next();
        switch (oper) {
            case "+":
                System.out.println("是加号");
                break;
            case "-":
                System.out.println("是减号");
                break;
            case "*":
                System.out.println("是乘号");
                break;
            case "/":
                System.out.println("是除号");
                break;
            case "%":
                System.out.println("是取余号");
                break;
            default:
                System.out.println("都不匹配");
        }
        int i, j;
        j = 1;
        i = 1;

        while(j <= 10){
            i *= j;
            j += 1;
        }
        System.out.println(i);

    }
}
