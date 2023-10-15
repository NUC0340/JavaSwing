package Demo10151;
// 进行项目的封装
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame {
    public MyFrame (String title) {
        super(title);

        PictureView c = new PictureView();
        c.setPreferredSize(new Dimension(100, 50)); // 更改大小
        this.setContentPane(c);

        c.setBgcolor( Color.YELLOW );

        try {
            BufferedImage image = ImageIO.read(new File("夏天y.png"));
            c.setAnImage(image);
        }   catch (IOException e) {
            e.printStackTrace();
        }

    }
}
