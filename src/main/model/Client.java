package model;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Client {

    String name;
    double income;
    String occupation;

    List<Double> expenses;
    List<String> expenseNames;
    List<Object> inv;


    Scanner in = new Scanner(System.in);

    public Client(String name, double income, String occupation) {
        this.name = name;
        this.income = income;
        this.occupation = occupation;
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

    public void manageYourExpenses(double groc, double ent, double food, double misItems) {

        double sum = groc + ent + food + misItems;
        double sumPerc = ((sum / income) * 100);
        System.out.println("You have spent " + sumPerc + " % of your income this month");
        if (sumPerc > 50) {
            System.out.println("You're expenses this month is really high!!");
            System.out.println("It is recommended to only spending  lower than 50% of your income on expenses");
        }
        expenseNames = Arrays.asList("groceries", "entertainment", "food", "miscellaneous items");
        expenses = Arrays.asList(groc, ent, food, misItems);
        System.out.println("You have spent :");
        String fillUp = " % of your income/allowance on ";
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((expenses.get(i) / income) * 100 + fillUp + expenseNames.get(i));
        }
    }

    public double getGrocPerc(double groc) {
        return groc;
    }

    public double getEntPerc(double ent) {
        return ent;
    }

    public double getFoodPerc(double food) {

        return food;
    }

    public double getMisItemsPerc(double misItems) {
        return misItems;
    }
    //EFFECTS : Add entries to an ArrayList inv

    public List<Object> addEntries(String invName, int amtInv, int currVal, String platform) {
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

    public void viewInvestment(String invName, int amtInv, int currVal, String platform) {


        inv = addEntries(invName, amtInv, currVal, platform);

        System.out.println("Here is a summary of your investment(s)");

        for (int i = 0; i < inv.size(); i++) {

            System.out.println(inv.get(i));

        }
        System.out.println("-------DONE!!--------");
    }




}





