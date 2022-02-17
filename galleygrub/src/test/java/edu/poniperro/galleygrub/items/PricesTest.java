package edu.poniperro.galleygrub.items;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PricesTest {
    @Test
    public void init_pricesTest() {
        Prices.init_prices();

        assertEquals(4, Prices.getItems().size());
    }

}
