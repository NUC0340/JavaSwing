package MySwing2;

import javax.swing.*;
import java.awt.*;

public class Demo10141 {
    public static void main(String[] args) {
        // 巩固训练
        // 首先先以父子类继承关系进行标题的起名
        JFrame frame = new MyFrame1("第二阶段基础学习");
        // 用JFrame中的函数setDefaultCloseOperation（JFrame.EXIT_ON_CLOSE）进行图形化交互的放大缩小退出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 用JFrame中的函数setSize进行长宽的定义
        frame.setSize(400,300);
        // 用JFrame中的函数setVisible进行图形化界面的显示
        frame.setVisible(true);


    }
}
