// EqualsTest类 字符串如果指向同一个对象，对应的地址是一样的，输出为真
// .equals函数用于比较String类型对象的值
package day04_WorkingWithObjects;

public class EqualsTest {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "she sells sea shells by the seashore. ";
        str2 = str1; //str2字符串指向和str1同一个对象，对应的地址是一样的，输出为真
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same Object? " + (str1 == str2)); // == 比较的是两个对象内存的地址值

        str2 = new String(str1); //str2字符串创建了一个新的对象，是一个新的地址
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same Object? " + (str1 == str2));// == 两个对象地址不同，输出假
        System.out.println("Same Value? " + (str1.equals(str2)));// .equals函数比较两String对象的具体值，为真
    }
}
