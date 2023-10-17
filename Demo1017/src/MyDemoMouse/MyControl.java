package MyDemoMouse;

import javax.swing.*;
import java.awt.*;

public class MyControl extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width  = this.getWidth();
        int height = this.getHeight();

        g.setColor(Color.white);
        g.fillRect(0,0,width,height);

        g.setColor(Color.black);
        g.drawRect(0,0,width-1,height-1);
    }
}
