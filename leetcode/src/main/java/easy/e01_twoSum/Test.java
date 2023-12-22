package easy.e01_twoSum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums =new int[]{2,7,11,15};
        Integer target = 9;
        TwoSum twoSum= new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
