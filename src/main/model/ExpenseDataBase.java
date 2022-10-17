package model;

import org.json.JSONObject;
import persistence.JsonReader;
import persistence.Writable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//This class will store the expenses of the client and write it to the JSON file
public class ExpenseDataBase implements Writable {


    private ArrayList<Expense> edb;
    JsonReader jsonReader2 = new JsonReader("./data/Client.json");


    public ExpenseDataBase() throws IOException {
        edb = jsonReader2.createEdbArrayList("./data/Client.json");
    }

    public void addEDB(Expense expense) {
        edb.add(expense);
    }

    public ArrayList<Expense> getEDB() {

        return this.edb;
    }

    public void setEdb(ArrayList<Expense> edb) {
        this.edb = edb;
    }

    @Override
    public JSONObject toJson() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("Expenses", getEDB());

        return jsonObj;
    }
}
