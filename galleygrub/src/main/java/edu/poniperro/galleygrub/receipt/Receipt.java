package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {

    private Double total;
    private Comanda order;

    public Receipt(Comanda comanda) {
        this.order = comanda;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public Double total() {
        return this.total;
    }

    @Override
    public void print() {
        getOrder().display();
        System.out.println("\tTOTAL-------->" + total());
    }
}