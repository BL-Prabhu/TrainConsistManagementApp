package service;

import model.Train;

import java.util.List;

/**
 * LinkedList-based implementation.
 */
public class TrainServiceImpl implements TrainService {

    private final Train train = new Train();

    @Override
    public void initialize() {
        List<String> list = train.getBogies();

        list.add("Engine");
        list.add("Sleeper");
        list.add("AC");
        list.add("Cargo");
        list.add("Guard");
    }

    @Override
    public void insertAt(int index, String bogie) {
        if (index < 0 || index > train.getBogies().size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        train.getBogies().add(index, bogie);
    }

    @Override
    public void removeFirst() {
        if (!train.getBogies().isEmpty()) {
            train.getBogies().removeFirst();
        }
    }

    @Override
    public void removeLast() {
        if (!train.getBogies().isEmpty()) {
            train.getBogies().removeLast();
        }
    }

    @Override
    public List<String> getConsist() {
        return train.getBogies();
    }
}