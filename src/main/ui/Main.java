package ui;


import model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    @SuppressWarnings("methodlength")
    public static void main(String[] args) {

        System.out.println("Welcome to Nabeel's Money Management Firm!");
//        System.out.println("Where your money will be managed right");

        System.out.println("\nSo What best describes you here :");
        System.out.println("----------------------");
        System.out.println(" (1) New Customer");
//        System.out.println(" (2) Return Customer");
        System.out.println("----------------------");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 1) {
//            System.out.println("Hello There! , Thank you choosing our firm to manage your hard-earned money");
            System.out.println("Before Continuing , I would like to ask you some information to serve you better");
            System.out.println("What is your Name : ");
            String name = in.next();
            System.out.println("What is your Occupation : ");
            String occupation = in.next();
            System.out.println("What is your income earned per month : ");
            double income = in.nextDouble();
            Client customer = new Client(name, income, occupation);
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
                System.out.println(" Would you like to avail any other services?");
                System.out.println("---------SERVICES-------------");
                System.out.println(" (1) Investment Option for Beginners");
                System.out.println(" (2) Manage your Expenses");
                System.out.println(" (3) View your Investment");
                System.out.println("------------------------------");
                System.out.println("Input any number to end the program");
                op = in.nextInt();
            }
            while (op == 2) {
                System.out.println("Hello " + name + ", You have chosen to avail our \"Manage your Expense\" Service");
                System.out.println("How much money have you spent on \"groceries\" this month : ");
                int groc = in.nextInt();
                System.out.println("How much money have you spent on \"entertainment\" this month : ");
                int ent = in.nextInt();
                System.out.println("How much money have you spent on \"eating\" out this month : ");
                int food = in.nextInt();
                System.out.println("How much money have you spent on \"miscellaneous items\" this month : ");
                int misItems = in.nextInt();
                customer.manageYourExpenses(groc,ent,food,misItems);
                System.out.println(" Would you like to avail any other services?");
                System.out.println("---------SERVICES-------------");
                System.out.println(" (1) Investment Option for Beginners");
                System.out.println(" (2) Manage your Expenses");
                System.out.println(" (3) View your Investment");
                System.out.println("------------------------------");
                System.out.println("Input of any number to end the program");
                op = in.nextInt();
            }
            while (op == 3) {
                System.out.println("Hello " + name + ", You have chosen to our \"Mange Your Investment Portfolio \" ");
                System.out.println("This service will help you add or view investments you have added before");
                System.out.println("Pls choose what would you like to do : ");
                System.out.println("---------SERVICES-------------");
                System.out.println(" (1) Add an Investment");
//              System.out.println(" (2) View previous investments");
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
                    System.out.println("% change in Investment : " + ((currVal - amtInv) / amtInv) * 100 + "%");
                    System.out.println("Which platform did you invest in :");
                    String platform = in.next();
                    in.nextLine();
                    customer.addEntries(invName, amtInv, currVal, platform);
                    customer.viewInvestment(invName, amtInv, currVal, platform);
                }
                System.out.println(" Would you like to avail any other services?");
                System.out.println("---------SERVICES-------------");
                System.out.println(" (1) Investment Option for Beginners");
                System.out.println(" (2) Manage your Expenses");
                System.out.println(" (3) View your Investment");
                System.out.println("------------------------------");
                System.out.println("Input of any number to end the program");
                op = in.nextInt();
            }

        }


    }
}




