package model;

//stores the expense values provided by the user.
public class Expense {
//    String category;
    int moneySptOnGroc;
    int moneySptOnEnt;
    int moneySptOnEat;
    int moneySptOnMI;

    public Expense(int moneySptOnGroc,int moneySptOnEnt,int moneySptOnEat,int moneySptOnMI) {

        this.moneySptOnGroc = moneySptOnGroc;
        this.moneySptOnEnt = moneySptOnEnt;
        this.moneySptOnEat = moneySptOnEat;
        this.moneySptOnMI = moneySptOnMI;


    }

//    public String getCategory() {
//        return category;
//    }

    public int getMoneySptOnGroc() {
        return moneySptOnGroc;
    }

    public int getMoneySptOnEnt() {
        return moneySptOnEnt;
    }

    public int getMoneySptOnEat() {
        return moneySptOnEat;
    }

    public int getMoneySptOnMI() {
        return moneySptOnMI;
    }
}

