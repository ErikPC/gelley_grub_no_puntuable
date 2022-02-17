package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemTest {
    @Test
    public void isRegularTesy() {
        Product patty = new Item("Krabby Patty", 1.25);
        Product rings = new Item("Krabby Patty", 1.25, "sauce");
        assertTrue(patty.isRegular());
        assertFalse(rings.isRegular());
    }
}
