package model;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Client {

    String name;
    double income;
    String occupation;

    Scanner in = new Scanner(System.in);

    public Client(String name, double income, String occupation) {
        this.name = name;
        this.income = income;
        this.occupation = occupation;
    }

    @SuppressWarnings("methodlength")
    //REQUIRES : income > 0
    //EFFECTS : Provides the user with investment options based on his income and provides
    // a rough estimate of return he/she could get if he invests in that option.
    public void investmentOptions() {
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
            System.out.println(" Your investment could potentially increase by : " + returnAmt() + "annually.");
            System.out.println("Would you like to avail any other services ?");
        } else if (income > 15000 && income < 40000) {
            System.out.println(" The best way for you to start is to invest in the \"Government Bonds\" ");
            System.out.println(" Govt Bond are debts gives to the respective country to support their funding");
            System.out.println(" Its recommended to invest in bonds of those countries with stable economies");
            System.out.println("Risk is MEDIUM");
            System.out.println(" Your investment could potentially increase by : " + returnAmt() + "annually.");
            System.out.println("Would you like to avail any other services ?");
        } else {
            System.out.println(" Considering you have a good income already.");
            System.out.println(" It is recommended for you to buy some real estate as they have high returns");
            System.out.println(" Risk is HIGH");
            System.out.println(" Your investment could potentially increase by : " + returnAmt() + "annually.");

        }


    }
    //REQUIRES : income > 0.
    //EFFECTS : returns the amount the user could possibly get achieve.

    public int returnAmt() {
        double recAmt = (income * 20) / 100;
        if (income <= 15000) {
            return (int) (recAmt + (recAmt * 0.10));
        } else if (income > 15000 && income < 40000) {
            return (int) (recAmt + (recAmt * 0.15));
        } else {
            return (int) (recAmt + (recAmt * 0.25));

        }

    }
    //REQUIRES : groc+ent+misItems+food < income
    //EFFECTS : Asks the user his monthly expenses and the method calculates whether he is overspending or not
    //Also provides with what proportion of his income was spent on these expenses.

    public void manageYourExpenses() {
        System.out.println("Hello " + name + ", You have chosen to avail our \"Manage your Expense\" Service");
        System.out.println("How much money have you spent on \"groceries\" this month : ");
        int groc = in.nextInt();
        System.out.println("How much money have you spent on \"entertainment\" this month : ");
        int ent = in.nextInt();
        System.out.println("How much money have you spent on \"eating\" out this month : ");
        int food = in.nextInt();
        System.out.println("How much money have you spent on \"miscellaneous items\" this month : ");
        int misItems = in.nextInt();
        int sum = groc + ent + food + misItems;
        double sumPerc = ((sum / income) * 100);
        System.out.println("You have spent " + sumPerc + " % of your income this month");
        if (sumPerc > 50) {
            System.out.println("You're expenses this month is really high!!");
            System.out.println("It is recommended to only spending  lower than 50% of your income on expenses");
        }
        List<String> expenseNames = Arrays.asList("groceries", "entertainment", "food", "miscellaneous items");
        List<Integer> expenses = Arrays.asList(groc, ent, food, misItems);
        System.out.println("You have spent :");
        String fillUp = " % of your income/allowance on ";
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((expenses.get(i) / income) * 100 + fillUp + expenseNames.get(i));
        }
    }
    //EFFECTS : Add entries to an ArrayList inv

    public List<Object> addEntries(String invName,int amtInv,int currVal,String platform) {
        List<Object> inv = new ArrayList<>();

        inv.add(invName);
        inv.add(amtInv);
        inv.add(currVal);
        inv.add(platform);

        return inv;
    }

    @SuppressWarnings("methodlength")
    //REQUIRES : User to follow menu strictly.
    //EFFECTS : provides the summary of investments that have been added

    public void viewInvestment() {

        System.out.println("Hello " + name + ", You have chosen to avail our \"Mange Your Investment Portfolio \"");
        System.out.println("This service will help you add or view investments you have added before");
        System.out.println("Pls choose what would you like to do : ");
        System.out.println("---------SERVICES-------------");
        System.out.println(" (1) Add an Investment");
//        System.out.println(" (2) View previous investments");
        System.out.println("------------------------------");
        int ch = in.nextInt();

        List<Object> inv = new ArrayList<>();

        if (ch == 1) {
            System.out.println("Pls add your investment details below : ");
            System.out.println("Pls enter the name of the  investment you wish to add");
            String invName = in.next();
            System.out.println("How much capital did you invest in this investment initially : ");
            int amtInv = in.nextInt();
            System.out.println("Current Value of this investment : ");
            int currVal = in.nextInt();
            System.out.println("% change in Investment : " + ((currVal - amtInv) / amtInv) + "%");
            System.out.println("Which platform did you invest in :");
            String platform = in.next();
            addEntries(invName,amtInv,currVal,platform);
//            System.out.println("Would you like to add more investments ?");
//            System.out.println("Press 1 if you want to add more or any number to view a summary");
//            ch = in.nextInt();
            inv = addEntries(invName,amtInv,currVal,platform);
        }

        System.out.println("Here is a summary of your investment(s)");

        for (int i = 0; i < inv.size(); i++) {
            System.out.println(inv.get(i));

        }
        System.out.println("-------DONE!!--------");




    }



}





