import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Testfall {

    @Test
    public void test() {
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(60, 10));
        items.add(new Item(100, 20));
        items.add(new Item(120, 30));

        assertEquals(220, Backtrack.backtrack(items, 50));

    }

}
