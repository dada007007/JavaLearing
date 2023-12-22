package easy.e67_addBinary;
//方法一：模拟列竖式，末位对齐，逐位相加，逢二进一
public class AddBinary67 {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        //a=1011,b=1101
        int n = Math.max(a.length(), b.length()), carry = 0;
        //n取a和b之间的长度大的值，carry先取0
        //carry是用来存储每一位计算进位后的结果（只能是1或0）
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            //carry先加a的末尾位，如果a短就补0  ;第四位 1
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            //carry再加b的末尾位，如果b到头了也补0 ;第四位 1
            ans.append((char) (carry % 2 + '0'));
            //每次ans添加对carry和取余后的值       2 % 2 = 0
            carry /= 2;  //carry = 1
            // carry除以2求得是下一位进位为1还是0
        }

        if (carry > 0) {            //遍历完如果最后carry是1
            ans.append('1');        //就证明最大一位都是1，然后两数和还要进位
        }
//        ans.reverse();

        return ans.toString();
    }
}
