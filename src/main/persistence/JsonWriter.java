package persistence;



import model.Client;
import model.ExpenseDataBase;
import model.InvestmentDataBase;
import org.json.JSONObject;


import java.io.*;

public class JsonWriter {
    private static final int TAB = 4;
    private String destination1;
    private PrintWriter writer1;


    public JsonWriter(String destination1) {
        this.destination1 = destination1;
    }

    // MODIFIES: this
    // EFFECTS: opens writer; throws FileNotFoundException if destination file cannot
    // be opened for writing
    public void open() throws FileNotFoundException {
        writer1 = new PrintWriter(destination1);
    }

    // MODIFIES: this
    // EFFECTS: writes JSON representation of InvestmentDataBase to file
    public void write(InvestmentDataBase idb) {
        JSONObject json = idb.toJson();
        saveToFile1(json.toString(TAB));
    }

    public void write(ExpenseDataBase edb) {
        JSONObject json1 = edb.toJson();
        saveToFile1(json1.toString(TAB));
    }


    // MODIFIES: this
    // EFFECTS: closes writer
    public void close() {
        writer1.close();
    }

    // MODIFIES: this
    // EFFECTS: writes string to file
    private void saveToFile1(String json) {
        writer1.print(json);
    }


}
