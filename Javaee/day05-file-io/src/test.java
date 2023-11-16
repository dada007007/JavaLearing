public class test {
    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(f(9));
        System.out.println(f(8));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2*(f(--n)+1);
        }
    }
}
