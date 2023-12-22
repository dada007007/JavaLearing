package easy.e2828_isAcronym;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List words = new ArrayList();
        words.add("never");
        words.add("gonna");
        words.add("give");
        words.add("up");
        words.add("on");
        words.add("you");
        String s = "ngguoy";
        IsAcronym isAcronym = new IsAcronym();
        System.out.println(isAcronym.isAcronym(words, s));
    }
}
