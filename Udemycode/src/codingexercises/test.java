package codingexercises;

public class test {
    public static void main(String[] args) {
        checknumber(12);
        checknumber(-15);
        checknumber(0);
}
    public static void checknumber(int x) {
        if( x > 0 ){
            System.out.println("positive");
        }
        else if( x < 0 ){
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
}

