package string_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethodDemo01 {
    public static void main(String[] args) {
        String s1 = "我是如来佛祖玉皇大帝观音菩萨指定取西经特派使者花果山水帘洞美猴王齐天大圣孙悟空";
        System.out.println(s1.length());

        char c = s1.charAt(25);
        System.out.println(c);

        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            System.out.print(c1 + " ");
        }
        System.out.println();

        String bjx = "赵钱孙李周吴郑王";
        char[] chars = bjx.toCharArray();
        //输出字符数组
        System.out.println(Arrays.toString(chars));

        String name = "jackDing";
        String inputName = "jackDing";
        System.out.println(name.equals(inputName));
        System.out.println(name.equalsIgnoreCase(inputName));


    }
}
