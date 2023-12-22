package easy.e67_addBinary;

public class AddBinary67BinaryToDecimalToBinary {
    public String addBinary(String a, String b) {
        Integer c = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        //先把两个二进制数转换乘十进制数进行计算
        System.out.println(Integer.valueOf(c));
        //打印一下c是20
        String c1 = Integer.toBinaryString(c);
        //把c再用toBinaryString方法转成字符串你并返回
        return c1;
    }
//    return Integer.toBinaryString(
//            Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
}
