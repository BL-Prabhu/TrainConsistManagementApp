package service;

import model.Bogie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BogieServiceImpl implements BogieService {

    private final List<Bogie> bogies = new ArrayList<>();

    @Override
    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    @Override
    public List<Bogie> getAllBogies() {
        return bogies;
    }

    @Override
    public List<Bogie> sortByCapacityAscending() {
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        return bogies;
    }

    @Override
    public List<Bogie> sortByCapacityDescending() {
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        return bogies;
    }

    // ✅ UC8 - Stream Filtering
    @Override
    public List<Bogie> filterByCapacityGreaterThan(int capacity) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > capacity)
                .collect(Collectors.toList());
    }
}