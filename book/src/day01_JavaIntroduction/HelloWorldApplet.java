package day01_JavaIntroduction;
import java.applet.*;
import java.awt.Graphics;

class HelloWorldApplet extends java.applet.Applet{
    public void paint(Graphics g){
        g.drawString("Hello World!" , 5, 25);
    }
}