package controller;


import service.TrainService;
import service.TrainServiceImpl;

import java.util.Set;

/**
 * Controller for UC5 operations
 */
public class TrainController {

    private final TrainService service;

    public TrainController() {
        this.service = new TrainServiceImpl();
    }

    public void addBogie(String bogie) {
        service.addBogie(bogie);
    }

    public Set<String> getFormation() {
        return service.getFormation();
    }
}