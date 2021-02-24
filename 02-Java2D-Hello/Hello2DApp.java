import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
        
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(800, 800);
    }

    public void paint (Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;     
        int w = getWidth();
        int h = getHeight();

        g2d.setPaint(Color.RED);
        g2d.drawRect(100, 100, 100, 200);
        g2d.drawRect(200,200,40,90);

        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        
             
       
        getContentPane().setBackground(new Color(93, 78, 96));
        
    }
       
        
}