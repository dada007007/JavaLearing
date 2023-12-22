package easy.e2418_sortPeople;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        SortPeople2418 s = new SortPeople2418();

        System.out.println(Arrays.toString(s.sortPeople(names, heights)));

    }
}
