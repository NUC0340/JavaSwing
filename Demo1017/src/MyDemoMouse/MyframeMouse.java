package MyDemoMouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 从这个开始学习鼠标事件
public class MyframeMouse extends JFrame {
    public MyframeMouse(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);
        // 所有控件（自定义控件）都支持鼠标事件
        // 鼠标事件，使用三类监听器
        /*
        1.addMouseListener(); 点击，按下，抬起，移入，移出
        2.addMouseMotionListener(); 移动，拖动
        3.addMouseWheelListener(); 鼠标滚轮转动
        */
        MyControl c = new MyControl();
        root.add(c);
        c.setPreferredSize(new Dimension(120,120));

        c.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("*******mousePressed()..");
                System.out.println("Location" + e.getPoint()); // e.getPoint()是显示该位置的坐标
                System.out.println("ScreenLocation" + e.getLocationOnScreen()); // 显示该位置在屏幕的坐标

                if(e.getButton() == MouseEvent.BUTTON1) {
                    System.out.println("left");
                }
                if(e.getButton() == MouseEvent.BUTTON2) {
                    System.out.println("middle");
                }
                if(e.getButton() == MouseEvent.BUTTON3) {
                    System.out.println("right");
                }
                // 利用if语句来实现鼠标三个键的方法
                // getClickCount(): 单击，双击以及三击
                if(e.getClickCount() == 2) {
                    System.out.println("nihao");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        // 如果只关注mouseListener之中的点击事件，但是却要将接口中的所有方法都写，形式上非常臃肿
        // 这里引入 MouseAdapter() 他可以遮蔽不需要的代码，想写哪个就写哪个
        // 可以简化代码
            c.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mousePressed(e);
                }
            });
    }
}
