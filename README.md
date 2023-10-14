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
