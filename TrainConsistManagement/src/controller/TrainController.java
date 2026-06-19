package controller;


import service.TrainService;
import service.TrainServiceImpl;

public class TrainController {

    private final TrainService trainService;

    public TrainController() {
        this.trainService = new TrainServiceImpl();
    }

    public void runUC2() {

        System.out.println("=======================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=======================================\n");

        trainService.performPassengerBogieOperations();
    }
}