package ui;


import model.Investment;
import model.InvestmentDataBase;
import persistence.JsonWriter;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class GUI implements ActionListener {

    JFrame frame;
    JPanel panel;

    JPanel newClientPanel;
    JPanel newClientPanel1;
    JPanel investmentPanel;
    JPanel investmentPanel1;
    JPanel submitInvestmentPanel;
    JPanel existingClientPanel;
    JPanel existingClientPanel1;
    JPanel investingOption1Panel;
    JPanel investingOption1Panel1;

    JLabel nameLabel;
    JLabel incomeLabel;
    JLabel occupationLabel;
    JLabel servicesLabel;
    JLabel investmentTitle;
    JLabel invNameLabel;
    JLabel invCurLabel;
    JLabel inVInLabel;
    JLabel invPlatformLabel;
    JLabel invOption1Label;

    Border border;

    JTextField textField;
    JTextField nameTextField;
    JTextField incomeTextField;
    JTextField occupationTextField;
    JTextField invNameTF;
    JTextField invCurTF;
    JTextField invInTF;
    JTextField invPlatformTF;

    JButton newClientButton;
    JButton oldClientButton;
    JButton viewInvestmentOptions;
    JButton manageYourExpenses;
    JButton manageYourInv;
    JButton invOptions;
    JButton submitButton;
    JButton exitButton;
    JButton loadInvestmentsButton;
    JButton loadExpensesButton;
    JButton addInvButton;
    JButton addExpButton;

    ImageIcon icon;


    InvestmentDataBase invDataBase;

    @SuppressWarnings("methodlength")
    public GUI() throws IOException {
        panel = new JPanel();
        newClientPanel = new JPanel();
        newClientPanel1 = new JPanel();
        investmentPanel = new JPanel();
        investmentPanel1 = new JPanel();
        submitInvestmentPanel = new JPanel();
        existingClientPanel = new JPanel();
        existingClientPanel1 = new JPanel();
        investingOption1Panel = new JPanel();
        investingOption1Panel1 = new JPanel();

        nameLabel = new JLabel();
        incomeLabel = new JLabel();
        servicesLabel = new JLabel();
        occupationLabel = new JLabel();
        investmentTitle = new JLabel();
        invNameLabel = new JLabel();
        invCurLabel = new JLabel();
        inVInLabel = new JLabel();
        invPlatformLabel = new JLabel();
        invOption1Label = new JLabel();

        newClientButton = new JButton();
        viewInvestmentOptions = new JButton("View Investments Options (For Beginners)");
        manageYourExpenses = new JButton("Manage Your Expenses");
        manageYourInv = new JButton(" Manage Your Investments ");
        invOptions = new JButton("Recommended Investing Options");
        submitButton = new JButton("SUBMIT");
        exitButton = new JButton("EXIT");


        occupationTextField = new JTextField();
        incomeTextField = new JTextField();
        invNameTF = new JTextField();
        invCurTF = new JTextField();
        invInTF = new JTextField();
        invPlatformTF = new JTextField();

        invDataBase = new InvestmentDataBase();


        setFrame();

    }


    //EFFECTS : Sets the main frame of the Graphical User Interface.
    void setFrame() {
        textField = new JTextField();
        textField.setBackground(new Color(240, 230, 140));
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


    //EFFECTS : Builds the panel which is eventually used in the main frame
    @SuppressWarnings("methodlength")
    void setPanel() {

        panel.setBackground(new Color(240, 230, 140));
        panel.setBounds(200, 300, 400, 200);

//        label1.setText("Pls Enter your Information Below : ");
//        label1.setForeground(Color.black);
//        label1.setFont(new Font("MV", Font.PLAIN, 10));
//        label1.setVisible(true);

        nameLabel.setText("Name :");
        nameLabel.setForeground(Color.black);
        nameLabel.setFont(new Font("MV", Font.PLAIN, 20));
        nameLabel.setVerticalTextPosition(JLabel.CENTER);

        nameTextField = new JTextField();
        nameTextField.setBounds(75, 85, 300, 30);

        newClientButton = new JButton("New Customer");
        newClientButton.setBounds(240, 140, 150, 30);
        newClientButton.addActionListener(this);

        oldClientButton = new JButton("Old Customer");
        oldClientButton.setBounds(10, 140, 150, 30);
        oldClientButton.addActionListener(this);


        panel.setLayout(new BorderLayout());

        panel.add(newClientButton);
        panel.add(oldClientButton);

        panel.add(nameTextField);
        panel.add(nameLabel);
        panel.setVisible(true);
        frame.add(panel);

        panel.setVisible(true);
    }

    //EFFECTS : When the user is a new customer then this panel comes ahead acts as the frame of the user to work upon.
    @SuppressWarnings("methodlength")
    public JPanel newClientPanel() {


        newClientPanel.setBackground(new Color(245, 222, 179));
        newClientPanel.setBounds(0, 0, 800, 700);
        newClientPanel.setLayout(null);
        icon = new ImageIcon("/Users/nabeelali/Desktop/cpsc210/project_t9d1e/data/NMMALogo.png");
        newClientPanel1 = new JPanel();
        newClientPanel1.setBackground(new Color(255, 230, 140));
        newClientPanel1.setBounds(230, 60, 400, 500);
        newClientPanel1.setVisible(true);
        newClientPanel1.setLayout(null);

        incomeLabel.setText("Income :");
        incomeLabel.setBounds(30, 170, 80, 90);
        incomeLabel.setLayout(null);
        incomeLabel.setForeground(Color.black);
        incomeLabel.setFont(new Font("MV BOLI", Font.PLAIN, 15));
//        incomeLabel.setVerticalTextPosition(JLabel.TOP);

        incomeTextField.setBounds(125, 200, 200, 30);


        occupationLabel.setText("Occupation :");
        occupationLabel.setBounds(30, 190, 210, 100);
        occupationLabel.setLayout(null);
        occupationLabel.setForeground(Color.black);
        occupationLabel.setFont(new Font("MV BOLI", Font.PLAIN, 15));
//        occupationLabel.setVerticalTextPosition(JLabel.TOP);

        servicesLabel.setText("Pls Choose One of our Services");
        servicesLabel.setBounds(95, 250, 210, 100);
        servicesLabel.setLayout(null);
        servicesLabel.setFont(new Font("MV BOLI", Font.PLAIN, 13));


        occupationTextField.setBounds(355, 290, 200, 30);

//        incomeLabel.setVerticalTextPosition(JLabel.CENTER);

        invOptions.setBounds(95, 340, 240, 30);
        invOptions.addActionListener(this);
        manageYourExpenses.setBounds(95, 370, 240, 30);
        manageYourExpenses.addActionListener(this);
        manageYourInv.setBounds(95, 400, 240, 30);
        manageYourInv.addActionListener(this);

        newClientPanel1.add(manageYourInv);
        newClientPanel1.add(manageYourExpenses);
        newClientPanel1.add(invOptions);
//        newClientPanel.setLayout(new BorderLayout());
        newClientPanel1.add(incomeLabel);
        newClientPanel1.add(occupationLabel);
        newClientPanel1.add(servicesLabel);
        newClientPanel1.add(incomeTextField);
        newClientPanel.add(occupationTextField);

//        newClientPanel.add(incomeLabel);

        newClientPanel.add(new JLabel(icon));
        newClientPanel1.setVisible(true);
        newClientPanel.add(newClientPanel1);


//        newClientPanel.setVisible(true);


        return newClientPanel;


    }


    //EFFECTS : When the new user clicks on the management of Investments
    // button then this panel this becomes the main frame.
    @SuppressWarnings("methodlength")
    public JPanel getInvestmentPanel() {
        investmentPanel.setBackground(new Color(245, 222, 179));
        investmentPanel.setBounds(0, 0, 800, 700);
        investmentPanel.setLayout(null);

        investmentTitle.setText("This is the Investment Management Service ");
        investmentTitle.setBounds(85, 80, 1000, 40);
        investmentTitle.setLayout(null);
        investmentTitle.setFont(new Font("MV BOLI", Font.BOLD, 15));


        investmentPanel1.setBackground(new Color(255, 230, 140));
        investmentPanel1.setBounds(160, 60, 500, 500);
        investmentPanel1.setVisible(true);
        investmentPanel1.setLayout(null);

        invNameLabel.setText("Name of the Investment :");
        invNameLabel.setBounds(50, 140, 240, 100);
        invNameLabel.setLayout(null);
        invNameLabel.setForeground(Color.black);
        invNameLabel.setFont(new Font("MV BOLI", Font.PLAIN, 13));

        invNameTF.setBounds(255, 175, 200, 30);

        inVInLabel.setText("Initial Value of the Investment :");
        inVInLabel.setBounds(50, 180, 330, 100);
        inVInLabel.setLayout(null);
        inVInLabel.setForeground(Color.black);
        inVInLabel.setFont(new Font("MV BOLI", Font.PLAIN, 13));

        invInTF.setBounds(255, 215, 200, 30);

        invCurLabel.setText("Current Value of Investment :");
        invCurLabel.setBounds(50, 220, 350, 100);
        invCurLabel.setLayout(null);
        invCurLabel.setForeground(Color.black);
        invCurLabel.setFont(new Font("MV BOLI", Font.PLAIN, 13));

        invCurTF.setBounds(255, 255, 200, 30);

        invPlatformLabel.setText("Platform of the Investment :");
        invPlatformLabel.setBounds(50, 260, 350, 100);
        invPlatformLabel.setLayout(null);
        invPlatformLabel.setForeground(Color.black);
        invPlatformLabel.setFont(new Font("MV BOLI", Font.PLAIN, 13));

        invPlatformTF.setBounds(255, 295, 200, 30);

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(220, 360, 50, 20);
        submitButton.addActionListener(this);

        investmentPanel1.add(investmentTitle);
        investmentPanel1.add(invNameLabel);
        investmentPanel1.add(invCurLabel);
        investmentPanel1.add(inVInLabel);
        investmentPanel1.add(invPlatformLabel);
        investmentPanel1.add(invNameTF);
        investmentPanel1.add(invCurTF);
        investmentPanel1.add(invInTF);
        investmentPanel1.add(invPlatformTF);
        investmentPanel1.add(submitButton);


        investmentPanel.add(investmentPanel1);


        return investmentPanel;
    }


    //EFFECTS : When the user clicks on the submit button then the user is shown a table of
    // values he had inputted for the investment field.
    public JPanel getSubmitInvestmentPanel() {
        submitInvestmentPanel.removeAll();
        submitInvestmentPanel.setVisible(true);
        submitInvestmentPanel.setBackground(new Color(245, 222, 179));
        submitInvestmentPanel.setBounds(0, 0, 800, 700);
        //submitInvestmentPanel.setLayout(null);
        String[][] arr = getInvDataBaseTable();
        String[] arr2 = {"Name", "Current Value", "Money", "Platform"};
        JTable table = new JTable(arr, arr2);
        JScrollPane scrollPane = new JScrollPane(table);
        submitInvestmentPanel.add(scrollPane);

        return submitInvestmentPanel;
    }

    //EFFECTS : Builds a JTable for which the user had added the Investment fields for.
    public String[][] getInvDataBaseTable() {
        ArrayList<Investment> investments = invDataBase.getIDB();
        String[][] invDataBase = new String[investments.size()][4];
        for (int i = 0; i < investments.size(); i++) {
            Investment in = investments.get(i);
            invDataBase[i][0] = in.getName();
            invDataBase[i][1] = in.getCurrVal() + "";
            invDataBase[i][2] = in.getMoneyInv() + "";
            invDataBase[i][3] = in.getPlatform();
        }
        return invDataBase;
    }

    //EFFECTS : On the main frame when the user clicks the existing user button then the user sees this panel which
    //consists of buttons for the user to view past entries.
    @SuppressWarnings("methodlength")
    public JPanel getExistingClientPanel() {

        existingClientPanel.setBackground(new Color(245, 222, 179));
        existingClientPanel.setBounds(0, 0, 800, 700);
        existingClientPanel.setLayout(null);


        existingClientPanel1.setBackground(new Color(255, 230, 140));
        existingClientPanel1.setBounds(230, 60, 400, 400);
        existingClientPanel1.setLayout(null);
        existingClientPanel1.setVisible(true);

        loadInvestmentsButton = new JButton("Load Added Investments ");
        loadInvestmentsButton.setBounds(100, 120, 200, 30);
        loadInvestmentsButton.addActionListener(this);

        loadExpensesButton = new JButton("Load Added Expenses ");
        loadExpensesButton.setBounds(100, 150, 200, 30);
        loadExpensesButton.addActionListener(this);

        addInvButton = new JButton();
        addInvButton.setBounds(100, 180, 200, 30);
        addInvButton.addActionListener(this);

        addExpButton = new JButton();
        addExpButton.setBounds(100, 210, 200, 30);
        addExpButton.addActionListener(this);

        existingClientPanel1.add(loadExpensesButton);
        existingClientPanel1.add(loadInvestmentsButton);
        existingClientPanel1.add(addInvButton);
        existingClientPanel1.add(addExpButton);


        existingClientPanel.add(existingClientPanel1);


        return existingClientPanel;

    }

    //EFFECTS : This panel will come up if user inputted montly income is less than 1500.
    public JPanel getInvestmentOptions1() {
        investingOption1Panel.setBackground(new Color(245, 222, 179));
        investingOption1Panel.setBounds(0, 0, 800, 700);
        investingOption1Panel.setLayout(null);


        investingOption1Panel1.setBackground(new Color(255, 230, 140));
        investingOption1Panel1.setBounds(230, 60, 400, 400);
        investingOption1Panel1.setLayout(null);
        investingOption1Panel1.setVisible(true);

        investingOption1Panel.add(investingOption1Panel1);

        return investingOption1Panel;
    }

    //EFFECTS : When the user clicks a button then all the functionalities of the button are taken care by this method.
    @SuppressWarnings("methodlength")
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newClientButton) {
            frame.setVisible(false);
            JPanel x = newClientPanel();
            frame.add(x);
            frame.setContentPane(x);
            frame.setVisible(true);


        }
        if (e.getSource() == manageYourInv) {
            frame.setVisible(false);
            JPanel x = getInvestmentPanel();
            frame.add(x);
            frame.setContentPane(x);
            frame.setVisible(true);
        }
        if (e.getSource() == submitButton) {

            String invNameText = invNameTF.getText();
            String invInValText = invInTF.getText();
            String invCurrValText = invCurTF.getText();
            String invPlatformText = invPlatformTF.getText();

            int z = Integer.parseInt(invInValText);
            int y = Integer.parseInt(invCurrValText);
            invDataBase.addIDB(new Investment(invNameText, z, y, invPlatformText));
            JsonWriter jsonWriter2 = new JsonWriter("./data/investments.json");
            try {
                jsonWriter2.open();
                jsonWriter2.write(invDataBase);
                jsonWriter2.close();
                System.out.println("Your data has been saved successfully.");
            } catch (FileNotFoundException f) {
                System.out.println("Unable to write data to file.");
            }
            JPanel x = getSubmitInvestmentPanel();
            frame.add(x);
            frame.setContentPane(x);
            frame.revalidate();
            frame.repaint();
            frame.setVisible(true);


        }
        if (e.getSource() == oldClientButton) {

            JPanel x = getExistingClientPanel();
            frame.add(x);
            frame.setContentPane(x);
            frame.revalidate();
            frame.repaint();
            frame.setVisible(true);
        }
        if (e.getSource() == loadInvestmentsButton) {


            JsonWriter jsonWriter2 = new JsonWriter("./data/investments.json");
            try {
                jsonWriter2.open();
                jsonWriter2.write(invDataBase);
                jsonWriter2.close();
                System.out.println("Your data has been saved successfully.");
            } catch (FileNotFoundException f) {
                System.out.println("Unable to write data to file.");
            }

            JPanel x = getSubmitInvestmentPanel();
            frame.add(x);
            frame.setContentPane(x);
            frame.revalidate();
            frame.repaint();
            frame.setVisible(true);


        }
        if (e.getSource() == addInvButton) {
            frame.setVisible(false);
            JPanel x = getInvestmentPanel();
            frame.add(x);
            frame.setContentPane(x);
            frame.setVisible(true);
        }
        if (e.getSource() == invOptions) {

            String y = incomeTextField.getText();
            int incComp = Integer.parseInt(y);

            if (incComp <= 1500) {

                frame.setVisible(false);
                JPanel x = getInvestmentOptions1();
                frame.add(x);
                frame.setContentPane(x);
                frame.setVisible(true);
            }
            JPanel x = getInvestmentOptions1();
            frame.add(x);
            frame.setContentPane(x);
            frame.setVisible(true);


        }

    }

    public static void main(String[] args) {

        try {
            GUI app = new GUI();
        } catch (IOException e) {
            System.out.println("No File Found");
        }
    }


}

