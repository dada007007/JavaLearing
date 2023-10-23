package day05_ArraysConditionalsAndLoops;

// 块语句
public class BlockStatement {
    void testblock() {
        int x = 10;
        {// start of block
            int y = 50;
            System.out.println("inside the block: ");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            // end of block
        }
    }

}
