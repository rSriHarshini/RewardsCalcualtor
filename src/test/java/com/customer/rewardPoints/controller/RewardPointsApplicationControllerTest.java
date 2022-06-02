package com.customer.rewardPoints.controller;

import com.customer.rewardPoints.service.RewardPointsApplicationService;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

public class RewardPointsApplicationControllerTest {

    @Mock
    protected RewardPointsApplicationService mockRewardPointsApplicationService;

    protected RewardPointsApplicationController rewardPointsApplicationController;

    @BeforeEach
    public void init() {
        rewardPointsApplicationController = new RewardPointsApplicationController();
    }

}
