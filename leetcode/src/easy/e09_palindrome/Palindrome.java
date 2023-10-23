package easy.e09_palindrome;
/* 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 , -121 不是 。  注意：0是回文数      */
public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0|| (x % 10 == 0 && x != 0)) {//x要是负数或正整数中被10整除的直接剔除（-123；1230），但是0是回文数
            return false;
        }
        int revertedNumber = 0; //用来记录尾数反转后的数字
        while(revertedNumber < x){//   12321                    1           2           3
            revertedNumber = revertedNumber * 10 + x % 10; //0*10 + 1       1*10+2      12*10 +3
            x /= 10;                                       // 1232          123         12
        }
        return revertedNumber == x || x == revertedNumber / 10;     //123321这种偶数位回文数就直接相等
                                            //12321 奇数位 revertedNumber 123   所以revertedNumber要除10比较
                                            //                  x        12
    }
}

