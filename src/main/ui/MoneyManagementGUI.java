package ui;


import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class MoneyManagementGUI {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.setBounds(0,0,100,100);
        panel.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Welcome to Nabeel's Money Management Agency ");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVisible(true);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Times New Roman",Font.BOLD,20));


        JFrame frame = new JFrame();
        Border border = BorderFactory.createLineBorder(new Color(139,69,19),5);
        frame.setTitle(" Nabeel's Money Management Application ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800,700);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(245,222,179));
        frame.add(label);
        frame.setVisible(true);
        label.setBorder(border);



    }


}
