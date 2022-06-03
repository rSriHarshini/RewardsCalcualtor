package com.customer.rewardPoints.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("CustomerId")
    private String customerId;
    @JsonProperty("CustomerName")
    private String customerName;
    @JsonProperty("Transactions")
    private List<Transaction> transactionList;

    public List<Transaction> getTransactionList() {
        return this.transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
