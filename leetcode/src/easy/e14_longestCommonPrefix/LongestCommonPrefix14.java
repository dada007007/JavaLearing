package easy.e14_longestCommonPrefix;
/*
编写一个函数来查找字符串数组中的最长公共前缀，如果不存在公共前缀，返回空字符串""
输入: strs = ["flower" , "flow", "flight"]
输出: "fl"
输入: strs = ["dog" , "racecar", "car"]
输出: ""
 */
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {     //当数组内没有没有元素或者为null，输入""
            return "";
        }
        String prefix = strs[0];            //把字符串数组第一个元素设成最长公共前缀
        int count = strs.length;            //count是数组长度
        for (int i = 1; i < count; i++) {       //遍历数组中的字符串与prefix比较，留下公共前缀
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {         //公共前缀长度为零证明都不一样就退出
                break;
            }
        }
        return prefix;          //返回公共前缀
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());        //将两个字符串输入进来，length取短的字符串长度
        int index = 0;      //定义索引为0
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            //索引在短字符串长度内且此索引对应两个字符串在此索引位置下的字符相等的时候，索引就自加
            index++;
        }
        return str1.substring(0, index);//最后返回0到索引位置的字符
    }


}
