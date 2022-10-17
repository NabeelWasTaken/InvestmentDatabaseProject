package persistence;

import model.Expense;
import model.ExpenseDataBase;
import model.Investment;
import model.InvestmentDataBase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JsonReaderTest {

    @Test
    void testReaderNonExistentFile() {

        JsonReader reader = new JsonReader("/data/NoSuchFile.json");
        try {
            InvestmentDataBase in = reader.read();

        } catch (Exception e) {

            fail("IOException expected");
        }


    }
    @Test
    void testReaderEmptyWorkRoom() throws IOException {
        JsonReader reader = new JsonReader("./data/testReaderEmptyWorkRoom.json");
        ArrayList<Investment> e = reader.createIdbArrayList("./data/testReaderEmptyWorkRoom.json");
        assertEquals(0,e.size());

    }
    @Test
    void testReaderGeneral() throws IOException {
        JsonWriter writer = new JsonWriter("./data/General.json");
        InvestmentDataBase idb1 = new InvestmentDataBase();
        idb1.setIdb(new ArrayList<>());
        idb1.addIDB( new Investment("nabeel", 12, 12, "platform"));
        writer.open();
        writer.write(idb1);
        writer.close();
        JsonReader jsonReader = new JsonReader("./data/General.json");
        idb1.setIdb(jsonReader.createIdbArrayList("./data/General.json"));
        assertEquals("nabeel", idb1.getIDB().get(0).getName());
        assertEquals(12, idb1.getIDB().get(0).getMoneyInv());
        assertEquals(12, idb1.getIDB().get(0).getCurrVal());
        assertEquals("platform", idb1.getIDB().get(0).getPlatform());
    }



}
