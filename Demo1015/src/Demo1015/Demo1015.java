package Demo1015;

import javax.swing.*;

public class Demo1015 {
    public static void main(String[] args) {
        JFrame myframe = new MyFrame("TextSwing");

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myframe.setSize(400,300);

        myframe.setVisible(true);

        myframe.setLocation(550,300);
    }
}
