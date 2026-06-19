package service;

import model.Train;

import java.util.Set;

/**
 * LinkedHashSet implementation
 */
public class TrainServiceImpl implements TrainService {

    private final Train train = new Train();

    @Override
    public void addBogie(String bogie) {
        train.getBogies().add(bogie);
    }

    @Override
    public Set<String> getFormation() {
        return train.getBogies();
    }
}