# JavaSwing

## 现在是20231014 19：06 对JAVASWING做了一个基本了解

        JFrame frame = new MyFrame1("第二阶段基础学习");
        // 用JFrame中的函数setDefaultCloseOperation（JFrame.EXIT_ON_CLOSE）进行图形化交互的放大缩小退出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 用JFrame中的函数setSize进行长宽的定义
        frame.setSize(400,300);
        // 用JFrame中的函数setVisible进行图形化界面的显示
        frame.setVisible(true);
        
这是构建一个窗口的基本条件
JPanel：是对一个窗口进行内容拓展，使之可以添加按钮，列表等工具，就是开拓了一片空间
内部类 佚名内部类 lamaber表达式 进行Swing中的事件处理也就是（监听器机制）
举例：佚名内部类：
         *         button.addActionListener(new ActionListener() {
         *            @Override
         *            public void actionPerformed(ActionEvent e) {
         *                showTime();
         *            }
         lamaber表达式：（优点：更加简洁，优化重复要写的内容）
      button.addActionListener((e)-> {
            System.out.println("the button has been clicked!");
            showTime();
        } );

以下均可以进行事件处理：     
    JButton；是创建一个按钮，可以进行点击
    JLabel： 标签，用于显示文本
    JTextField：文本框
    JCheckBox： 可以让用户勾选选项
    JComboBox： 下拉列表是一个泛型
## 现在是2023.10.15 15.24 对图像化界面的布局和绘制图形图片进行学习
### 在图形化界面中学习了如何布局
1.默认的Layoutmanager FlowLayout流式布局管理器 其中FlowLayout对子控件从左到右，从上到下依次排列
2.边界布局器： BorderLayout 将容器分为东西南北中五个区域。用法： 需要指定每个控件加到东西南北中的位置。
3.手工布局： 不使用布局器 root.setLayout(null);添加子控件 root.add（a1）；指定控件的位置 a1.setBounds(0,0,100,50);
### 自定义标签：
 private static class ColorLabel extends JLabel将相同变量的标签综合到一个类中
### 绘制图片和图形
都要用到这个函数paintComponent(Graphics g)
绘制背景： g.fillRect(0, 0, width, height);填充颜色： g.setColor(new Color(255, 255, 255));
算法： 准确绘制每个图片的长宽比：
            int imgW = image.getWidth(null);
            int imgH = image.getHeight(null);
            int fitW = width;
            int fitH = width * imgH / imgW;
            if( fitH > height) {
                fitH = height;
                fitW = height * imgH / imgH;
                }
            int fitX = (width - fitW) / 2;
            int fitY = (height - fitH) / 2;
            g.drawImage(image, fitX, fitY, fitW, fitH,null);
#### 图片的载入
        try {
            File file = new File("data/1.png");// 这里是要加载的文件
            this.image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
## 现在是20231017 21：23
### 将之前的文件封装和资源文件的录入做了封装优化
### 对鼠标事件进行了部分学习
        1.addMouseListener(); 点击，按下，抬起，移入，移出
        2.addMouseMotionListener(); 移动，拖动
        3.addouseWheelListener(); 鼠标滚轮转动
以及鼠标事件的部分API
### 学习了鼠标事件的遮蔽器（类似于当初的布局器） 可以很好的遮蔽代码 完成自己想要做的事件
 

