package com.customer.rewardPoints.model;

import java.util.Map;

public class CustomerOutput {
    private String customerName;
    private Map<String, Integer> rewardsMap;

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Map<String, Integer> getRewardsMap() {
        return this.rewardsMap;
    }

    public void setRewardsMap(Map<String, Integer> rewardsMap) {
        this.rewardsMap = rewardsMap;
    }

    public CustomerOutput(String customerName, Map<String, Integer> rewardsMap) {
        this.customerName = customerName;
        this.rewardsMap = rewardsMap;
    }

}
