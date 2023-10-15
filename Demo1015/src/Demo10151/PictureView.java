package Demo10151;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Color.*;

public class PictureView extends JPanel {
    private BufferedImage image;
    private Color bgcolor;
    public PictureView() {
        super(true);
        // 绘制一张图片 try catch
        try {
            File file = new File("data/1.png");
            this.image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setBgcolor (Color color) {
        bgcolor = color;
        this.repaint();
    }
    public void setAnImage(BufferedImage image) {
        this.image = image;
        this.repaint();
    }
    @Override
    protected void paintComponent(Graphics g){
            int width = getWidth();
            int height = getHeight();
            super.paintComponent(g);

            if(bgcolor != null) {
                g.setColor( bgcolor );
                g.fillRect(0, 0, width, height);
            }
            if(image != null) {

                int imgW = image.getWidth(null);
                int imgH = image.getHeight(null);

                // (fitW,fitH) : 要求保持长宽比，并且在目标矩形之内
                // 1.图像不能超出控制范围
                // 2.图像比叫按原始比例显示

                // 先尝试以窗口之宽度作为图片宽度，按比例绘制图片
                int fitW = width;
                int fitH = width * imgH / imgW;
                if( fitH > height) {
                    // 若图片高度fitH超出宽度高度，就以窗口高度为图片高度，按比例绘制图片
                    fitH = height;
                    fitW = height * imgH / imgH;
                }

                // 绘制图片
                int fitX = (width - fitW) / 2;
                int fitY = (height - fitH) / 2;
                g.drawImage(image, fitX, fitY, fitW, fitH,null);
            }


        /*// 绘制矩形 rectangle
        g.setColor(Color.RED);
        g.fillRect(30,30,100,50);

        // 绘制椭圆 Oval
        g.setColor(Color.BLUE);
        g.fillOval(30,30,100,50); // 宽度和高度一样就是圆
*/
        }

    }


