package mytest2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:";

        String regex = "(.+?)#";
        Pattern pattern = Pattern.compile(regex);

        // 2、把内容和爬取规则建立联系，得到一个匹配器对象
        Matcher matcher = pattern.matcher(userStrs);

        // 3、开始使用匹配器对象，开始爬取内容
        while (matcher.find()){
            System.out.println(matcher.group(1));
    }
}}
