package day05_ArraysConditionalsAndLoops;

// 创建不同类型数组，学会输出数组长度
public class CreatingArray {
    public static void main(String[] args) {
        String[] name = new String[3];
        int[] num = new int[5];
        Integer[] temp = new Integer[6];
//        name[3] = "eggplant";           超出数组的范围，报错
//       System.out.println(name[3]);
        int len = name.length;
        System.out.println(len);     // 输出数组长度


        // Java不支持多维数组
        int records[][] = new int[12][12];
        records[0][0] = 1;
        records[5][4] = 5;
        System.out.println(records[0][0]);

    }
}
