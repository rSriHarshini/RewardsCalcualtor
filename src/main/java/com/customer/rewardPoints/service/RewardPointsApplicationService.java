package com.customer.rewardPoints.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.customer.rewardPoints.model.Customer;
import com.customer.rewardPoints.model.CustomerOutput;
import com.customer.rewardPoints.model.Transaction;

import org.springframework.stereotype.Service;

@Service
public class RewardPointsApplicationService {

   public Map<String, Integer> getRewards(List<Transaction> transactionDetails) {
      Map<String, Integer> outputMap = new HashMap<String, Integer>();

      for (Transaction transaction : transactionDetails) {
         Integer reward = getRewards(transaction.getTransactionAmount());

         SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
         simple = new SimpleDateFormat("MMMM");
         String month = simple.format(transaction.getTransactionDate());

         if (outputMap.containsKey(month)) {
            reward = reward + outputMap.get(month);
            outputMap.put(month, reward);
         } else {
            outputMap.put(month, reward);
         }
      }
      return outputMap;
   }

   private Integer getRewards(Integer transactionAmount) {
      Integer reward = 0;
      Integer rewardFactor = 1;
      if (transactionAmount > 50 && transactionAmount <= 100) {
         reward = ((transactionAmount - 50) * rewardFactor);
      } else if (transactionAmount > 100) {
         reward = ((transactionAmount - 50) * rewardFactor) + ((transactionAmount - 100) * rewardFactor);
      }

      return reward;
   }

   public List<CustomerOutput> getRewardsForACustomer(List<Customer> customerDetails) {
      Map<String, Integer> rewardsMap = new HashMap<String, Integer>();
      List<CustomerOutput> customerRewardsList = new ArrayList<CustomerOutput>();

      for (Customer customer : customerDetails) {
         rewardsMap = getRewards(customer.getTransactionList());
         customerRewardsList.add(new CustomerOutput(customer.getCustomerName(), rewardsMap));
      }
      return customerRewardsList;

   }
}