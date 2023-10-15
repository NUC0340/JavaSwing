package Demo1015;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class MyPicture extends JPanel {
    BufferedImage image;
    public MyPicture() {
        super(true);
        // 绘制一张图片 try catch
        try {
            File file = new File("data/1.png");
            this.image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 其中，JLpanel，既是控件，也是容器
    @Override
    protected void paintComponent(Graphics g){
            // 自定义控件的绘制
            // 首先获取他的长宽高
            int width = getWidth();
            int height = getHeight();
            super.paintComponent(g);
            // 绘制背景
            g.fillRect(0, 0, width, height);
            // 填充颜色
            g.setColor(new Color(255, 255, 255));
            // 算法：长宽比的保持
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

        /*// 绘制矩形 rectangle
        g.setColor(Color.RED);
        g.fillRect(30,30,100,50);

        // 绘制椭圆 Oval
        g.setColor(Color.BLUE);
        g.fillOval(30,30,100,50); // 宽度和高度一样就是圆
*/
        }

    }


