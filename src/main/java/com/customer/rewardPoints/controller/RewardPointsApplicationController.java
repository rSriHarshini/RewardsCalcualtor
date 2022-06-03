package com.customer.rewardPoints.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rewardPoints.model.Customer;
import com.customer.rewardPoints.model.CustomerOutput;
import com.customer.rewardPoints.service.RewardPointsApplicationService;

@RestController
@RequestMapping("/rewards")
public class RewardPointsApplicationController {

    @Autowired
    RewardPointsApplicationService rewardService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, path = "/")

    public List<CustomerOutput> getRewardPoints(@RequestBody List<Customer> customerTransactionDetails) {

        List<CustomerOutput> customerOutput = rewardService.getRewardsForACustomer(customerTransactionDetails);

        return customerOutput;

    }
}
