package easy.test;

import java.util.Map;

/*
编写一个函数来查找字符串数组中的最长公共前缀，如果不存在公共前缀，返回空字符串""
输入: strs = ["flower" , "flow", "flight"]
输出: "fl"
输入: strs = ["dog" , "racecar", "car"]
输出: ""
 */
public class test1 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (index < length && str1.charAt(i) == str2.charAt(i)) {
                index++;
            }
        }
        return str1.substring(0, index);
    }


}
