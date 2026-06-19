package controller;


public class TrainController {

    private final com.train.service.TrainService trainService;

    public TrainController() {
        this.trainService = new com.train.service.impl.TrainServiceImpl();
    }

    public void startApplication() {
        trainService.initializeTrain();
        trainService.displaySummary();
    }
}