package MySwing2;

import com.sun.tools.jconsole.JConsoleContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame {
    JComboBox<String> colorField = new JComboBox<>();
    public MyFrame1 (String title) {
        super(title);
        // 老样子设置一个容量 并且构造它
        JPanel root = new JPanel();
        this.setContentPane( root );


        // 创建一个下拉列表 JComboBox
        // JComboBox<String> colorField = new JComboBox<>();
        // 可见，JComoBox是一个泛型，参数类型T表示的数据项的类型
        root.add(colorField);

        colorField.addItem("red");
        colorField.addItem("purple");
        colorField.addItem("black");
        colorField.addItem("yellow");

        JButton button = new JButton("Start");
        root.add( button );
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text();
            }
        });
    }

    public void text() {
        int index = colorField.getSelectedIndex();
        System.out.println(index);
        int count = colorField.getItemCount();
        String value = colorField.getItemAt(0);
        System.out.println(count + " " + value);
    }
}
