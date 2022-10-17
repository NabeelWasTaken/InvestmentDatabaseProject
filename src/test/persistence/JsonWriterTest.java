package persistence;

import model.Expense;
import model.ExpenseDataBase;
import model.Investment;
import model.InvestmentDataBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JsonWriterTest {

    @Test
    void testWriterInvalidFile() {
        try {
            InvestmentDataBase in = new InvestmentDataBase();
            JsonWriter writer = new JsonWriter("./data/my\0illegal:fileName.json");
            writer.open();
            fail("IOException was expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    void testWriterEmptyWorkroom() {
        try {
            InvestmentDataBase in = new InvestmentDataBase();
            JsonWriter writer = new JsonWriter("./data/testWriterEmpty.json");
            writer.open();
            writer.write(in);
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterEmpty.json");
            in = reader.read();
            assertEquals(0, reader.createIdbArrayList("./data/testWriterEmpty.json").size());
        } catch (IOException e) {
            fail("Exception should not have been thrown");
        }
    }
    @Test
    void testWriterGeneral() throws IOException {
        JsonWriter writer = new JsonWriter("./data/General1.json");
        ExpenseDataBase edb1 = new ExpenseDataBase();
        edb1.setEdb(new ArrayList<>());
        edb1.addEDB( new Expense(12, 12, 12, 12));
        writer.open();
        writer.write(edb1);
        writer.close();
        edb1.setEdb(new ArrayList<>());
        JsonReader jsonReader = new JsonReader("./data/General1.json");
        edb1.setEdb(jsonReader.createEdbArrayList("./data/General1.json"));
        assertEquals(12, edb1.getEDB().get(0).getMoneySptOnGroc());
        assertEquals(12, edb1.getEDB().get(0).getMoneySptOnEnt());
        assertEquals(12, edb1.getEDB().get(0).getMoneySptOnEat());
        assertEquals(12, edb1.getEDB().get(0).getMoneySptOnMI());
    }
}




//}
