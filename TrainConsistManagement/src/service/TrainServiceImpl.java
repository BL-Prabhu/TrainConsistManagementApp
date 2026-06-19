package com.train.service.impl;

import com.train.model.Train;
import com.train.service.TrainService;

public class TrainServiceImpl implements TrainService {

    private Train train;

    @Override
    public void initializeTrain() {
        this.train = new Train();
        System.out.println("Train initialized successfully...");
    }

    @Override
    public void displaySummary() {
        System.out.println("Initial Bogie Count : " + train.getBogieCount());
        System.out.println("Current Train Consist : " + train.getBogies());
    }
}