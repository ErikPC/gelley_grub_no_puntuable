package edu.poniperro.galleygrub.order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {
    @Test
    public void sizeTest() {
        Order orden = new Order();
        orden.addItem("Coral Bits", 1.00);
        orden.addItem("Kelp Rings", 1.50);
        assertEquals(2, orden.size());
    }

}
