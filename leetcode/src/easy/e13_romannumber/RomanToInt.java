package easy.e13_romannumber;

import java.util.HashMap;
import java.util.Map;
/*
例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。
数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数*/
/*
示例 1:
输入: s = "III"
输出: 3

示例 2:
输入: s = "IV"
输出: 4

示例 3:
输入: s = "IX"
输出: 9

示例 4:
输入: s = "LVIII"
输出: 58
解释: L = 50, V= 5, III = 3.
示例 5:
输入: s = "MCMXCIV"
输出: 1994
解释: M = 1000, CM = 900, XC = 90, IV = 4.
*/
class RomanToInt {
    Map<Character , Integer> symbolValues = new HashMap<>(){{
        put('I', 1);            //定义哈希表存储键值对 罗马字母对应的值
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int ans = 0;            //ans存储最终返回的数字
        int n = s.length();         //n是字符串的长度
        for (int i = 0; i < n; ++i) {   //从所得到罗马数字最左边字符开始遍历
            int value = symbolValues.get(s.charAt(i));  //value存储每一次遍历得到的罗马字符对应的数值
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {//
                // 同时满足遍历到的字符不是最右边的一位，而且对应的数值要小于它右边一位所对应的数值
                ans -= value;//要减掉左边这个数值，比如IX中的I是-1，I右边一位X是10大于1
            } else {
                ans += value;//否则其他情况就是顺序排布直接加对应的数值
            }
        }
        return ans;
    }
}
