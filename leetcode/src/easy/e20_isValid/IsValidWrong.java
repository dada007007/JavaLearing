package easy.e20_isValid;
/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。
示例 1：
输入：s = "()"
输出：true
示例 2：
输入：s = "()[]{}"
输出：true
示例 3：
输入：s = "(]"
输出：false*/
public class IsValidWrong {
    public boolean isValid(String s) {
        String strs1 = "(";
        String strs2 = ")";
        String strs3 = "[";
        String strs4 = "]";
        String strs5 = "{";
        String strs6 = "}";
        int index = 0;
        int[] sum = {0,0,0,0,0,0};
        for (int i = 0; i < s.length(); i++) {
            if (strs1.charAt(0)==s.charAt(i)){
                sum[0]++;
            }
            if (strs2.charAt(0)==s.charAt(i)){
                sum[1]++;
            }
            if (strs3.charAt(0)==s.charAt(i)){
                sum[2]++;
            }
            if (strs4.charAt(0)==s.charAt(i)){
                sum[3]++;
            }
            if (strs5.charAt(0)==s.charAt(i)){
                sum[4]++;
            }
            if (strs6.charAt(0)==s.charAt(i)){
                sum[5]++;
            }
        }
        if(sum[0]==sum[1]&&sum[2]==sum[3]&&sum[4]==sum[5]){
            return true;
        }else {
            return false;
        }

    }


}
