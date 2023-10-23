// ReferencesTest类 对对象引用的解释说明
package day04_WorkingWithObjects;
import java.awt.Point;

class ReferencesTest {
    public static void main(String[] args) {
        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1;
        pt1.x = 200;   // 更改pt1的x和y4
        pt2.y = 200;
        System.out.println("Point1: " + pt1.x + " , " + pt1.y);
        System.out.println("Point2: " + pt2.x + " , " + pt2.y);
        //pt2的值也随之改变，因为pt2 = pt1相当于两者引用同一个对象
    }
}
