import java.awt.*;

public class HelloAgainApplet extends java.applet.Applet {
    Font f = new Font("TimeRoman", Font.BOLD, 36);
    public void paint(Graphics g){
        g.setFont(f);
        g.setColor(Color.RED);
        g.drawString("Hello again!", 5, 50);
    }
}
