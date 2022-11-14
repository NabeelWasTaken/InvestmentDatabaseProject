package ui;

import model.*;
import persistence.JsonReader;
import persistence.JsonWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//The front end of the program that will technically
// take values from the user and provide with relevant services and the user is free to take use of any services.
public class App {
    private static final String JSON_STORE = "./data/Client.json";
    private Scanner in;
    InvestmentDataBase idb;
    ExpenseDataBase edb;
    private JsonWriter jsonWriter;
    private JsonWriter jsonWriter2;
    String name;
    int income;
    String passwd;

    Client customer;


    public App() throws IOException {

        this.name = name;
        this.income = income;
        this.passwd = passwd;

        in = new Scanner(System.in);
        jsonWriter = new JsonWriter(JSON_STORE);
        jsonWriter2 = new JsonWriter("./data/investments.json");
        idb = new InvestmentDataBase();
        edb = new ExpenseDataBase();

        mainMenu();
    }

    @SuppressWarnings("methodlength")
    void mainMenu() {

        loadExpenses();

        //loadInvestmentsDB();
        System.out.println("Welcome to Nabeel's Money Management Firm!");
        System.out.println("\nSo What best describes you here :");
        System.out.println("----------------------");
        System.out.println(" (1) New Customer");
        System.out.println(" (2) Returning Customer");
        System.out.println("----------------------");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 1) {

            System.out.println("Before Continuing , I would like to ask you some information to serve you better");
            System.out.println("What is your Name : ");
            String name = in.next();
            System.out.println("Pls type in the password for your account :");
            String passwd = in.next();
            System.out.println("What is your Occupation : ");
            String occupation = in.next();
            System.out.println("What is your income earned per month : ");
            income = in.nextInt();

            customer = new Client(name, income, occupation);
            System.out.println("\nHello " + name + " , Which one of these services are you interested in availing?");
            System.out.println("---------SERVICES-------------");
            System.out.println(" (1) Investment Option for Beginners");
            System.out.println(" (2) Manage your Expenses");
            System.out.println(" (3) Manage your Investment(s)");
            System.out.println("------------------------------");

            int op = in.nextInt();
            while (op == 1) {
                System.out.println("Welcome, You have chosen to avail our \"Investment Option for Beginners\" Service");
                System.out.println("This will help you get started and recommend you where to invest your money");
                System.out.println("The income you have provided to us is : " + income);
                double recAmt = (income * 20) / 100;
                System.out.println("The recommended amount for you to invest : " + recAmt + "%");
                if (income <= 15000) {
                    System.out.println(" The best way for you to start is to invest in the \"stock market\" ");
                    System.out.println(" Your safest bets would be to invest in index funds namely :");
                    System.out.println(" S&P 500 : Index fund Comprising of the top 500 companies in America");
                    System.out.println(" Dow Jones IA : It is an index fund of top 30 American companies");
                    System.out.println(" Companies which have potential to grow in the coming future");
                    System.out.println("Risk is LOW");
                    System.out.println(" Your investment could increase by : " + customer.returnAmt() + "annually.");
                    System.out.println("Would you like to avail any other services ?");
                } else if (income > 15000 && income < 40000) {
                    System.out.println(" The best way for you to start is to invest in the \"Government Bonds\" ");
                    System.out.println(" Govt Bond are debts gives to the respective country to support their funding");
                    System.out.println(" Its recommended to invest in bonds of those countries with stable economies");
                    System.out.println("Risk is MEDIUM");
                    System.out.println(" Your investment could increase by : " + customer.returnAmt() + "annually.");
                    System.out.println("Would you like to avail any other services ?");
                } else {
                    System.out.println(" Considering you have a good income already.");
                    System.out.println(" It is recommended for you to buy some real estate as they have high returns");
                    System.out.println(" Risk is HIGH");
                    System.out.println(" Your investment could increase by : " + customer.returnAmt() + "annually.");

                }

                displayMenu();
                op = in.nextInt();
            }


            while (op == 2) {

                addExpenses();
                displayMenu();
                op = in.nextInt();
            }
            while (op == 3) {

                addInvestments();
                displayMenu();
                op = in.nextInt();
            }

            saveInvestment();
            saveExpenses();


        } else if (choice == 2) {

            System.out.println("Welcome, It's great to have you back! ");
            System.out.println(" What would you like to do today ?");
            System.out.println("---------MENU-------------------------");
            System.out.println(" (1) View Added Investment(s)");
            System.out.println(" (2) View your Expenses");
            int retUser = in.nextInt();
            if (retUser == 1) {
                System.out.println("Here is a summary of your Investment portfolio :");
                loadInvestmentsDB();
            } else if (retUser == 2) {
                System.out.println("You have chosen to view your expenses : ");


            }
        }


    }

    private void displayMenu() {
        System.out.println("Would you like to avail any other services ?");
        System.out.println("---------SERVICES-------------");
        System.out.println(" (1) Investment Option for Beginners");
        System.out.println(" (2) Manage your Expenses");
        System.out.println(" (3) Manage your Investment(s)");
        System.out.println("------------------------------");
        System.out.println(" Input any number to terminate the program ");

    }

    @SuppressWarnings("methodlength")
    //EFFECTS : Adds Investment details given by the user.
    private void addInvestments() {
        System.out.println("Hello " + name + ", You have chosen to our \"Mange Your Investment Portfolio \" ");
        System.out.println("This service will help you add or view investments you have added before");
        System.out.println("Pls choose what would you like to do : ");
        System.out.println("---------SERVICES-------------");
        System.out.println(" (1) Add an Investment");
        System.out.println("------------------------------");
        int ch = in.nextInt();
        if (ch == 1) {
            System.out.println("Pls add your investment details below : ");
            System.out.println("Pls enter the name of the  investment you wish to add");
            String invName = in.next();
            in.nextLine();
            System.out.println("How much capital did you invest in this investment initially : ");
            int amtInv = in.nextInt();
            System.out.println("Current Value of this investment : ");
            int currVal = in.nextInt();
            double percChange = ((double) (currVal - amtInv) / amtInv) * 100;
            System.out.println(percChange);
            System.out.println("% change in Investment : " + percChange + "%");
            System.out.println("Which platform did you invest in :");
            String platform = in.next();
            in.nextLine();
            Investment customerInv = new Investment(invName, amtInv, currVal, platform);
            idb.addIDB(customerInv);
            customer.viewInvestment(invName, amtInv, currVal, platform);

        }
    }

    void loadInvestmentsDB() {
        for (Investment i : idb.getIDB()) {
            System.out.println("Name of Investment : " + i.getName());
            System.out.println("Money Initially Invested : " + i.getMoneyInv());
            System.out.println("Current Value of Investment :" + i.getCurrVal());
            System.out.println("Investment Platform :" + i.getPlatform());
        }
    }
    //EFFECTS : Adds Expenses to class ExpenseDB.

    public void addExpenses() {

        System.out.println("Hello " + name + ", You have chosen to avail our \"Manage your Expense\" Service");
        System.out.println("How much money have you spent on \"groceries\" this month : ");
        int groc = in.nextInt();
        System.out.println("How much money have you spent on \"entertainment\" this month : ");
        int ent = in.nextInt();
        System.out.println("How much money have you spent on \"eating\" out this month : ");
        int food = in.nextInt();
        System.out.println("How much money have you spent on \"miscellaneous items\" this month : ");
        int misItems = in.nextInt();
        Expense customerExp = new Expense(groc, ent, food, misItems);
        edb.addEDB(customerExp);
        customer.manageYourExpenses(groc, ent, food, misItems);
        System.out.println("Would you like to save your Expenses ? (Y/N)");
        String saveExp = in.nextLine();
        saveExp.toUpperCase();
        if (saveExp == "yes" || saveExp == "Y") {
            System.out.println("Your data has been saved successfully.");
            saveExpenses();
        }

    }

    private void loadExpenses() {

        for (Expense e : edb.getEDB()) {
            System.out.println("Money Spent on Grocery : " + e.getMoneySptOnGroc());
            System.out.println("Money Spent on Entertainment : " + e.getMoneySptOnEnt());
            System.out.println("Money Spent on Food : " + e.getMoneySptOnEat());
            System.out.println("Money Spent on Miscellaneous Items : " + e.getMoneySptOnMI());
        }

    }

    //EFFECTS : Saves the Investment details to the JSON file.
    private void saveInvestment() {
        try {
            jsonWriter2.open();
            jsonWriter2.write(idb);
            jsonWriter2.close();
            System.out.println("Your data has been saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write data to file." + JSON_STORE);
        }
    }
    //EFFECTS : Saves the Expense details to the JSON file

    private void saveExpenses() {
        try {
            jsonWriter.open();
            jsonWriter.write(edb);
            jsonWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write expenses to file." + JSON_STORE);
        }
    }


}














