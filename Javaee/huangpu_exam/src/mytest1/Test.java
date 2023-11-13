package mytest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Integer> prisoner = new ArrayList<>();
        Random rd = new Random();
        for (int i = 1; i <= 100; i++) {
            int code = rd.nextInt(200) + 1;
            if (prisoner.contains(code)) {
                i--;
            } else {
                prisoner.add(code);
            }
        }
        System.out.println(prisoner);
        System.out.println(prisoner.size());
        List<Integer> prisoner1 = new ArrayList<>();
        prisoner1.addAll(prisoner);

        while (prisoner.size() > 1) {
            for (int i = prisoner.size() % 2 == 0 ? prisoner.size() - 2 : prisoner.size() - 1; i >= 0; i -= 2) {
                prisoner.remove(i);
            }
        }
        System.out.println(prisoner.get(0));

        for (int i = 0; i < prisoner1.size(); i++) {
            if (prisoner.get(0)==prisoner1.get(i)){
                System.out.println(i+1);
            }
        }
    }
}
