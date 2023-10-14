package MySwing1;

import javax.swing.*;

public class Demo1014 {
    public static void main(String[] args) {

        // JFrame指一个窗口，构造方法的参数为窗口标题
        // JFrame frame = new JFrame("Swing Example");
        // 创建一个窗口，里面包含了窗口的信息，这样代码看起来不繁琐
        // 这种写法以后不会使用:MyFrame frame = new MyFrame("hehe");
        // 这里使用多态来明确表示父类和子类的关系
        // 实例的真实类型：MyFrame; 实例的名义类型：JFrame

        JFrame frame = new MyFrame("hhhh");

        // 当关闭整个窗口时，退出整个程序 （在Swing高级篇教程中会介绍)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口的其他参数，如窗口大小、
        frame.setSize(400,300);

        // 显示窗口
        frame.setVisible(true);
    }
}
// 总结：一个项目里的main方法里的代码太过冗长，所以引入自定义窗口