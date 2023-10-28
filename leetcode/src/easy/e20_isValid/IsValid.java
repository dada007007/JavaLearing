package easy.e20_isValid;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsValid {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {   //如果字符串长度已经为单数了，则没必要往下进行了
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{//哈希表存入(){}[]键值对
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();//创建双端队列，把
        for (int i = 0; i < n; i++) {   //遍历字符串
            char ch = s.charAt(i);      //每个位置的字符存一下
            if (pairs.containsKey(ch)) {        //如果pairs键值对中有这个字符的值
                if (stack.isEmpty()//这半句没懂
                        || stack.peek() != pairs.get(ch)) {
                    //如果这个字符的键值对所对应的字符不等于从末尾渠道的字符
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
