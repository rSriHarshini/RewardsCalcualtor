package com.customer.rewardPoints.model;

import java.util.Date;

public class Transaction {
    private Date transactionDate;
    private Integer transactionAmount;

    public Transaction() {
    }

    public Transaction(Date transactionDate, Integer transactionAmount) {
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getTransactionAmount() {
        return this.transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    
}
