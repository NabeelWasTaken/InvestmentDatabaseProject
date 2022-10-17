package model;

import org.json.JSONArray;
import org.json.JSONObject;
import persistence.JsonReader;
import persistence.Writable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This class will store the expenses of the client and write it to the JSON file
public class InvestmentDataBase implements Writable {

    private ArrayList<Investment> idb;
    JsonReader jsonReader = new JsonReader("./data/investments.json");


    public InvestmentDataBase() throws IOException {
        idb = jsonReader.createIdbArrayList("./data/investments.json");
    }

    public void addIDB(Investment inv) {
        idb.add(inv);
    }

    public void setIdb(ArrayList<Investment> idb) {
        this.idb = idb;
    }

    public ArrayList<Investment> getIDB() {
        return this.idb;
    }

    @Override
    public JSONObject toJson() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("Investments", getIDB());
        return jsonObj;
    }


}

