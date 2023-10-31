package easy.e28_strStr;
//找出字符串中第一个匹配项的下标
/*
给你两个字符串 haystack 和 needle ，
请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
如果 needle 不是 haystack 的一部分，则返回  -1 。
示例 1：
输入：haystack = "sadbutsad", needle = "sad"
输出：0
解释："sad" 在下标 0 和 6 处匹配。
第一个匹配项的下标是 0 ，所以返回 0 。
示例 2：
输入：haystack = "leetcode", needle = "leeto"
输出：-1
解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
*/
public class StrStr_Baolipipei {
    public int strStr(String haystack, String needle) { //传入一个两个字符串
        int n = haystack.length(), m = needle.length();  //获取两个字符串长度
        for (int i = 0; i + m <= n; i++) {      //循环直到i+短的字符串和长字符串长度一样结束
            boolean flag = true;            //来个flag，内循环break后flag每次重置
            for (int j = 0; j < m; j++) {
                //让字符串 needle 与字符串 haystack 的所有长度为 m 的子串均匹配一次
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    //循环中长字符串i+j处的字符串不等于短字符串j处的字符时，直接跳出循环，
                    flag = false;
                    break;//如果到最后也是false的话，则返回-1
                }
            }
            if (flag) {
                return i;//false如果执行为True,则返回成功的那个i的位置
            }
        }
        return -1;//如果到最后也是false的话，则返回-1
    }
}
