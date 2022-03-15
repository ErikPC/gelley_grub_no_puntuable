package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extras;
import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {
    public Comanda getOrder();

    public void setChain(Extras extra);

    public Extras getChain();

    public Double total();

    public void sumExtrasCharge();

    public void print();
}
