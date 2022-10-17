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
                customer.investmentOptions();
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
                customer.manageYourExpenses();
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
                customer.viewInvestment();
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




