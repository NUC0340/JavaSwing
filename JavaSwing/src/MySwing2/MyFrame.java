package MySwing2;

import javax.management.remote.JMXConnectorProvider;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    // 首先先写子类
    JButton nextButton = new JButton("continue");
    JTextField textField = new JTextField(20);
    JCheckBox checkBox = new JCheckBox("I have read and agree to the terms of The User Agreement");
    public MyFrame(String title) {
        super(title);
        // 先设置一个容器
        JPanel root= new JPanel();
        // 用函数this.setContentPane(名字);
        this.setContentPane( root );

        // 设置一个按钮并且添加
        JButton button = new JButton("Start");
        root.add( button );

        // 写一个文本框控件并且添加
        root.add( textField );
        textField.setText("helloWorld");

        // 复选框控件 JCheckBox 可以让用户来勾选一个选项
        // 相关API
        /**
         * - setSelected(true / false) 设置选中状态
         * - isSelected()  是否选中
         * - addActionListener() 勾选或取消获取事件
         */
        root.add(checkBox);

        checkBox.setSelected(true); //交互界面的复选框自动打对勾

        // 下一步按纽
        root.add(nextButton);

        // 界面的初始化：我们希望没勾选之前continue是禁用的，勾选完后亮起
        checkBox.setSelected(false);
        // setEnabled（true/false）若是false则按钮禁用
        nextButton.setEnabled(false);

        // 给按钮添加事件处理，若勾选后则按钮可用
        // 写一个佚名内部类
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( checkBox.isSelected()) {
                    nextButton.setEnabled(true);
                }else {
                    nextButton.setEnabled(false);
                }
            }
        } );
    }
}

