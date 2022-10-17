package persistence;

import model.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


import org.json.*;

// Is a reader that reads data from Client from JSON data stored in file.
public class JsonReader {

    private InvestmentDataBase idb;

    private ExpenseDataBase edb;

    private String src;

    public JsonReader(String src) {
        this.src = src;


    }


    public InvestmentDataBase read() {
        return idb;
    }



    public ArrayList<Investment> createIdbArrayList(String f) throws IOException {
        ArrayList<Investment> arr = new ArrayList<>();
        String json = readFile(f);
        JSONObject obj = new JSONObject(json);
        JSONArray jarr = new JSONArray(obj.getJSONArray("Investments"));
        for (Object k: jarr) {
            JSONObject x = (JSONObject) k;
            Investment investment = new Investment(x.getString("name"), x.getInt("moneyInv"),
                    x.getInt("currVal"), x.getString("platform"));
            arr.add(investment);
        }
        return arr;
    }

    public ArrayList<Expense> createEdbArrayList(String f) throws IOException {
        ArrayList<Expense> arr = new ArrayList<>();
        String json = readFile(f);
        JSONObject obj = new JSONObject(json);
        JSONArray jarr = new JSONArray(obj.getJSONArray("Expenses"));
        for (Object k: jarr) {
            JSONObject x = (JSONObject) k;
            Expense expense = new Expense(x.getInt("moneySptOnEat"), x.getInt("moneySptOnEnt"),
                    x.getInt("moneySptOnMI"), x.getInt("moneySptOnGroc"));
            arr.add(expense);
        }
        return arr;
    }

    private String readFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }

}
