package MySwing1;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    //将控件设置在外部类的成员变量中，这样内部类就可以实现调用修改
    JLabel timeLabel = new JLabel();

    public MyFrame(String title) {
        super(title);

        // 设置一个容器
        JPanel root= new JPanel();
        this.setContentPane( root );

        // 设置一个按钮 JButton new后面是文本,引用.add函数添加一个按钮
        JButton button = new JButton("测试");
        root.add(button);

        // 这里介绍文本框控件JTextField
        // JTextField API
        JTextField textField = new JTextField(20);//添加长度
        root.add(textField);
        textField.setText("helloworld");

        // JLabel, 标签控件，用于显示文本
        // 另外一种写法：root.add(new JLabel("你好Swing"));
        JLabel label = new JLabel("你好Swing");
        root.add(label);
        root.add(new JLabel("helloSwing"));
        // 这里是详细的API
        // 改字体和颜色
        label.setFont(new Font("微软雅黑",Font.PLAIN,14) );
        label.setForeground(new Color(0,255,255));
        //设置背景
        label.setOpaque(true);// 背景不透明
        label.setBackground(new Color(0,0,255));// 和上一个配合
        // 控件大小
        label.setPreferredSize(new Dimension(60,30));
        // 文本对齐 -CENTER居中-LEFT居左-RIGHT居右
        label.setHorizontalAlignment(SwingConstants.CENTER);
        // 添加一个JLabel控件用来显示时间
        root.add(timeLabel);

        // 此时引入Swing中事件处理的 《监听器机制》（例如，当按钮被点击时，执行相应的处理）
        /**
         *         ActionListener listener = new MyActionListener();
         *         button.addActionListener(listener);
         */

        ///////////////////////////
        // 这里也可以引入佚名内部类
        /**
         *         button.addActionListener(new ActionListener() {
         *            @Override
         *            public void actionPerformed(ActionEvent e) {
         *                showTime();
         *            }
         *        }
         *     }
         */
        // 可以看到用佚名内部类当然可以，如果按钮多了起来，显然每次都写这么多很繁琐
        // 这里就用到了Lamaber表达式
        // e是方法参数，花括号内是方法体.会自动转化为佚名内部类
        button.addActionListener((e)-> {
            System.out.println("the button has been clicked!");
            showTime();
        } );

    }
    public void showTime() {
        System.out.println("The button has been clicked");
        // 这里能做到点击按钮并且显示时间
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeStr = sdf.format(new Date());
        System.out.print(timeStr);

        // 可以在控制台中打印，但是我们要求是在图形化界面进行打印
        // setText函数就是设置它显示的文本
        // 在内部类中，可以访问当前外部对象的属性
        // 完整形式： MyFrame.this.timeLabel.setText(timeStr); 通常前面外部类的MyFrame.this可以省略
        timeLabel.setText( timeStr );

        // 东西太多很繁琐，在外部创建一个类引用即可
    }
}