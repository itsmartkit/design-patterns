package com.itsmartkit.mediator;

/**
 * 具体中介，自如
 */
public class ZiroomMediator extends Mediator {

    private Renter renter;

    private Saler saler;

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    @Override
    public void constact(Colleague colleague, String msg) {
        if (colleague instanceof Renter) {
            saler.getMessage(msg);
        } else {
            renter.getMessage(msg);
        }
    }
}
