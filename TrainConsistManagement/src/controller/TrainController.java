package controller;

import service.TrainService;
import service.TrainServiceImpl;

import java.util.List;

/**
 * Controller layer for Train operations.
 */
public class TrainController {

    private final TrainService service;

    public TrainController() {
        this.service = new TrainServiceImpl();
    }

    public void initializeTrain() {
        service.initialize();
    }

    public void insertBogie(int index, String bogie) {
        service.insertAt(index, bogie);
    }

    public void removeFirst() {
        service.removeFirst();
    }

    public void removeLast() {
        service.removeLast();
    }

    public List<String> getConsist() {
        return service.getConsist();
    }
}