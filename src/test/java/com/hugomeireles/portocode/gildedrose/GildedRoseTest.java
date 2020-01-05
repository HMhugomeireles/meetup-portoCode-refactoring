package com.hugomeireles.portocode.gildedrose;

import com.hugomeireles.portocode.gildedrose.GildedRose;
import com.hugomeireles.portocode.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void checkItemName() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }



}
