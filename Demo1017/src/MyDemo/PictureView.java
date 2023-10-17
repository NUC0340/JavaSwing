package MyDemo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class PictureView extends JPanel {
    private BufferedImage image;
    private Color bgcolor;
            public PictureView() {
                super(true);
                // 创建一个图片 记住：永远不要把图片放在src目录下，这是你解决了半个小时的bug
                try {
                    File file = new File("data/夏天y.png");
                    this.image = ImageIO.read( file );// 从本地读取文件
                } catch (IOException e) { // IOException e是调用出错的问题
                    e.printStackTrace(); // printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因
                }
            }

            public void setColor(Color bgcolor) {
                this.bgcolor = bgcolor;
                this.repaint();
            }

            public void setImage(BufferedImage image) {
                this.image = image;
                this.repaint();
            }
    // 如果每次都要加载图片时，都要加入try catch函数很麻烦 这里加入两个函数作为优化
             public void setImage( File file) {
                try {
                    this.image = ImageIO.read(file);
                    this.repaint();
            }  catch (IOException e) {
                    e.printStackTrace();
                }
            }

            public void setImage(String resoucePath) {
                try {
                    InputStream res  =this.getClass().getResourceAsStream(resoucePath);
                    this.image = ImageIO.read(res);
                    this.repaint();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        if(bgcolor != null) {
            g.setColor( bgcolor );
            g.fillRect(0,0,width,height);
        } else g.setColor(Color.WHITE);

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
        // 下面是图片边框的添加
        if(true) {
            g.setColor(Color.BLACK);
            g.drawRect(0,0,width-1,height-1);
        }
        // 若图片和边框有位置关系
        // 切记：先画图再画边框
    }
}
// 资源文件 ： 添加资源文件到src目录 在这个目录下新建一个包res 把png图片拷贝到res下
// 注意 这个res 和 bin是同步的
