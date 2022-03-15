package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extras;
import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {

    private Double total = 0.00;
    private Comanda order;
    private Extras firstExtra;

    public Receipt(Comanda comanda) {
        this.order = comanda;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public Double total() {
        if (firstExtra != null) {
            sumExtrasCharge();
        }

        return this.total;
    }

    @Override
    public void setChain(Extras extra) {
        this.firstExtra = extra;
    }

    @Override
    public Extras getChain() {
        return this.firstExtra;
    }

    @Override
    public void sumExtrasCharge() {
        firstExtra.sumExtras(getOrder());
        this.total = getOrder().getTotal();

    }

    @Override
    public void print() {
        getOrder().display();
        System.out.println("\tTOTAL--------> " + String.format("%.2f", this.total) + "$");
    }
}