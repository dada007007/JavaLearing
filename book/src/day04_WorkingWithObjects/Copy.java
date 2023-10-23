package day04_WorkingWithObjects;
import java.lang.Object;

import java.awt.*;
import java.applet.*;

public class Copy {
    public static void main(String[] args) {
        Point pt1, pt2, pt3 ;
        pt1 = new Point(0, 0);
        pt2 = new Point(100, 100);
        pt2.clone(); // pt1的值赋值给pt2，现在都是(0, 0)
        System.out.println(pt2.getX() + pt2.getY());
        pt3 = (Point) pt2.clone();
    }
}
