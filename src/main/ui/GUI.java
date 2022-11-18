package ui;


import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame frame;
    JPanel panel;
    JPanel newClientPanel;
    JLabel label;
    JLabel label1;
    Border border;
    JTextField textField;
    JTextField nameTextField;
    JButton newClientButton;
    JButton oldClientButton;
    JButton viewInvestmentOptions;
    JButton manageYourExpenses;
    JButton manageYourInv;

    public GUI() {
        panel = new JPanel();
        label = new JLabel();
        label1 = new JLabel();
        newClientButton = new JButton();
        newClientPanel = new JPanel();


        setFrame();

    }

    void setFrame() {
        textField = new JTextField();
        textField.setBackground(new Color(240,230,140));
        textField.setBounds(0, 0, 800, 150);
        textField.setOpaque(true);
        textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
        textField.setText("Welcome to Nabeel's Money Management Agency ");
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setForeground(Color.BLACK);
        textField.setFocusable(false);
        textField.setEditable(false);
        textField.setLayout(null);

        frame = new JFrame();
        frame.setTitle(" Nabeel's Money Management Application ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 700);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(245, 222, 179));
        frame.setLayout(null);


        frame.add(textField);
        setPanel();
        frame.setVisible(true);

    }


    @SuppressWarnings("methodlength")
    JPanel setPanel() {

        panel.setBackground(new Color(240,230,140));
        panel.setBounds(200, 300, 400, 200);

        label1.setText("Pls Enter your Information Below : ");
        label1.setForeground(Color.black);
        label1.setFont(new Font("MV", Font.PLAIN, 10));
        label1.setVisible(true);

        label.setText("Name :");
        label.setForeground(Color.black);
        label.setFont(new Font("MV", Font.PLAIN, 20));
        label.setVerticalTextPosition(JLabel.CENTER);

        nameTextField = new JTextField();
        nameTextField.setBounds(75, 85, 300, 30);

        newClientButton = new JButton("New Customer");
        newClientButton.setBounds(240,140,150,30);
        newClientButton.addActionListener(this);

        oldClientButton = new JButton("Old Customer");
        oldClientButton.setBounds(10,140,150,30);
        oldClientButton.addActionListener(this);



//        label.setHorizontalTextPosition(11);
////        label.setVerticalTextPosition(10);



        panel.setLayout(new BorderLayout());
        panel.add(newClientButton);
        panel.add(oldClientButton);
        panel.add(label1);
        panel.add(nameTextField);
        panel.add(label);
        panel.setVisible(true);
        frame.add(panel);

        panel.setVisible(true);
    }

    public JPanel newClientPanel() {

        newClientPanel.setBackground(new Color(240,230,140));
        panel.setBounds(4800, 3800, 4800, 4800);

        return newClientPanel;





    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newClientButton) {
//            frame.setVisible(false);
            JPanel x = newClientPanel();
            frame.add(x);

            frame.setContentPane(x);
            frame.setVisible(true);


        }
        if (e.getSource() == oldClientButton) {
            System.out.println("old");
        }

    }

    public static void main(String[] args) {

        GUI app = new GUI();
    }


}

