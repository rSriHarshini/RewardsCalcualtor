package com.customer.rewardPoints.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.customer.rewardPoints.model.Transaction;
import com.customer.rewardPoints.service.RewardPointsApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/rewards")
public class RewardPointsApplicationController {

    @Autowired
     RewardPointsApplicationService reward;
    
    @GetMapping
    public Map<String,Integer> getRewardPoints()
    {
        Map<String,Integer> rewardsPerMonth = new HashMap<String,Integer>();

        List<Transaction> transactionDetails = new ArrayList<Transaction>();
       
        Date sf = new Date();
        Date sf1 = new Date();
        Date sf2 = new Date();
        Date sf3 = new Date();
        Date sf4 = new Date();
        try 
        {
            sf = new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01");
            sf1 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-01");
            sf2 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-21");
            sf3 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-01");
            sf4 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01");
        } 
        catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        transactionDetails.add(new Transaction(sf,(Integer) 120));
        transactionDetails.add(new Transaction(sf1,(Integer) 120));
        transactionDetails.add(new Transaction(sf2,(Integer) 120));
        transactionDetails.add(new Transaction(sf3,(Integer) 120));
        transactionDetails.add(new Transaction(sf4,(Integer) 120));
        
        rewardsPerMonth =  reward.getRewards(transactionDetails);

        return rewardsPerMonth;
        
    }
}
