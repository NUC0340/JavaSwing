package Demo1015;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame (String title) {
        super(title);
        // 将自定义控件添加
        MyPicture c = new MyPicture();
        c.setPreferredSize(new Dimension(100, 50)); // 更改大小
        this.setContentPane(c);
        // 布局管理器 LayoutManager 可以将控件添加到图形化界面中
        // 默认的，JPanel自带一个FlowLayout流式布局管理器，其中FlowLayout对子控件从左到右，从上到下依次排列
        // 相当于：
        // LayoutManager layout = new FlowLayout();
        // root.setLayout(layout);
        //-----------------------------------------------------------------
        // 以下将会介绍不一样的布局器
        // 1.边界布局器： BorderLayout 将容器分为东西南北中五个区域
        // root.setLayout( new BorderLayout() );
        // 用法： 需要指定每个控件加到东西南北中的位置
        // 宽度和高度可以用setPreferedSize（）决定
        // 2.手工布局： 不使用布局器 root.setLayout(null);
        // 添加子控件 root.add（a1）；
        // 指定控件的位置 a1.setBounds(0,0,100,50);

        // 添加四个Laber
/*       ColorLabel a1 = new ColorLabel("1",Color.BLUE);
        ColorLabel a2 = new ColorLabel("2",Color.YELLOW);
        ColorLabel a3 = new ColorLabel("3",Color.WHITE);
        ColorLabel a4 = new ColorLabel("4",Color.pink);

        root.add(a1);
        root.add(a2);
        root.add(a3);
        root.add(a4);
    }*/
    }
    private static class ColorLabel extends JLabel {
        public ColorLabel(String text, Color bgColor) {
            this.setText( text );
            this.setOpaque(true);
            this.setBackground( bgColor );
            this.setPreferredSize(new Dimension(60,30));
            this.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }
}
