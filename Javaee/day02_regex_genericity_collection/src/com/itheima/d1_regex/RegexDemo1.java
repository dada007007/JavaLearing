package com.itheima.d1_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 目标：通过校验QQ号码格式带同学们初步认识正则表达式的使用步骤，并体会其便捷性。
        System.out.println(checkQQ2("251425789"));
        System.out.println(checkQQ2("051425789"));
        System.out.println(checkQQ2("2514ab2579"));
        System.out.println(checkQQ2("2514"));
        System.out.println(checkQQ2(null));
    }

    private static boolean checkQQ2(String qq) {
        // 正则表达式的使用步骤：
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq){
        // 需求：全部是数字，首字母不是0，长度是 6-20
        // 1、判断非法情况。
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
            return false;
        }

        // 2、是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if(c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
