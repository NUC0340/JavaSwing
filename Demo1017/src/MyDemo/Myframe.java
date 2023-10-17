package MyDemo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Myframe extends JFrame {
    public Myframe(String title) {
        super(title);

        JPanel root = new JPanel();
        this.setContentPane(root);

        PictureView p = new PictureView();
        root.add(p);
        p.setPreferredSize(new Dimension(250,250));
        p.setImage("/res/林少.png");
    }
}
