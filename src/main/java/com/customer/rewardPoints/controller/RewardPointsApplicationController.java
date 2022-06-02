package com.customer.rewardPoints.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.customer.rewardPoints.model.Transaction;
import com.customer.rewardPoints.service.RewardPointsApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/rewards")
public class RewardPointsApplicationController {

    @Autowired
    RewardPointsApplicationService reward;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, path = "/")

    public Map<String, Integer> getRewardPoints(@RequestBody List<Transaction> transactions) {
        Map<String, Integer> rewardsPerMonth = new HashMap<String, Integer>();

        rewardsPerMonth = reward.getRewards(transactions);

        return rewardsPerMonth;

    }
}
