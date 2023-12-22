package easy.e09_palindrome;

public class Palindrome_StringBuilderReverse {
    public boolean isPalindrome(int x) {
        String x1 = Integer.toString(x);
        StringBuilder x2 = new StringBuilder();
        x2.append(x1);
        System.out.println(x2);
        String reverse = x2.reverse().toString();
        System.out.println(reverse);
        if (reverse.equals(x1)) {
            return true;
        }
        return false;
    }
}
