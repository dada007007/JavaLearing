package day02_Object_Oriented_Programming;

public class main {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("-------");
        System.out.println("Starting engine... ");
        m.startEngine();
        System.out.println("-------");
        System.out.println("Calling showAtts");
        m.showAtts();
        System.out.println("-------");
        System.out.println("Starting engine... ");
        m.startEngine();
    }
}
