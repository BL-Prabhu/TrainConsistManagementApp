package service;

import model.Bogie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
    public List<Bogie> filterByCapacityGreaterThan(int capacity) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > capacity)
                .collect(Collectors.toList());
    }

    // ✅ UC9 - Grouping
    @Override
    public Map<String, List<Bogie>> groupBogiesByType() {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }
}