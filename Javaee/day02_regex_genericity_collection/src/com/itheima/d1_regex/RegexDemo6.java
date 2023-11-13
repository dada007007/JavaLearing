package com.itheima.d1_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        // 目标：了解使用正则表达式去文本中爬取想要的信息。(了解)
        String data = "欢迎张全蛋光临本系统！他删库并跑路欢迎李二狗子光临本系统！" +
                " 欢迎马六子光临本系统！它浏览了很多好看的照片！欢迎夏洛光临本系统！他在六点钟送出了一个嘉年华!" ;
        // 需要爬取出所有进入系统的用户名。

        // 1、指定爬取规则对象：设置匹配规则。
//         String regex1 = "欢迎(.+)光临"; // 贪婪匹配。
        String regex2 = "欢迎(.+?)光临"; // 非贪婪匹配

        Pattern p = Pattern.compile(regex2);

        // 2、让内容和爬取规则建立关系，得到一个匹配器对象。
        Matcher matcher = p.matcher(data);
        // 3、开始使用匹配器对象，开始爬取内容
        while (matcher.find()) {
            // 把爬到的信息提取出来
            String rs = matcher.group(1); // 我只要爬取内容中的第一组（）内容
            System.out.println(rs);
        }
    }
}
