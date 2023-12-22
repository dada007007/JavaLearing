package easy.e2828_isAcronym;

import java.util.List;


/*
给你一个字符串数组 words 和一个字符串 s ，请你判断 s 是不是 words 的 首字母缩略词 。
如果可以按顺序串联 words 中每个字符串的第一个字符形成字符串 s ，
则认为 s 是 words 的首字母缩略词。
例如，"ab" 可以由 ["apple", "banana"] 形成，
但是无法从 ["bear", "aardvark"] 形成。
如果 s 是 words 的首字母缩略词，返回 true ；否则，返回 false
*/
public class IsAcronym {
    public boolean isAcronym(List<String> words, String s) {
        final String[] a = {""};
        words.stream().forEach(e -> {
            String s1 = e.substring(0, 1);
            a[0] = a[0] +s1;
        });
        System.out.println(a[0]);
        if (a[0].equals(s)) {
            return true;
        }
        return false;
    }
}
