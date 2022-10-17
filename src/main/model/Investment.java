package model;

import org.json.JSONObject;

//This class will store the investment details provided by the user.
public class Investment {

    private String name;
    private int moneyInv;
    private int currVal;
    private String platform;

    public Investment(String name, int moneyInv, int currVal, String platform) {

        this.name = name;
        this.moneyInv = moneyInv;
        this.currVal = currVal;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public int getMoneyInv() {
        return moneyInv;
    }

    public int getCurrVal() {
        return currVal;
    }

    public String getPlatform() {
        return platform;
    }

//    public JSONObject toJson() {
//
//        JSONObject jsonObj = new JSONObject();
//        jsonObj.put("Investment Name ", getName());
//        jsonObj.put("Initial Money Spent  ", getMoneyInv());
//        jsonObj.put("Current Value of money on the Investment ",getCurrVal());
//        jsonObj.put("Platform Investment in ", getPlatform());
//        return jsonObj;
//
//    }

}
