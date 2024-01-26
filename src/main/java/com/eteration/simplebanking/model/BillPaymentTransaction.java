package com.eteration.simplebanking.model;

import javax.persistence.Entity;

@Entity
public class BillPaymentTransaction extends Transaction {

    private double amount;

    public BillPaymentTransaction(double amount) {

        this.amount = amount;
    }

    public BillPaymentTransaction() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
