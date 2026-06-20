package controller;

import model.Bogie;
import service.BogieService;
import service.BogieServiceImpl;

import java.util.List;
import java.util.Map;

public class BogieController {

    private final BogieService service;

    public BogieController() {
        this.service = new BogieServiceImpl();
    }

    public void addBogie(String name, int capacity, String type) {
        service.addBogie(new Bogie(name, capacity, type));
    }

    public List<Bogie> getFilteredBogies(int capacity) {
        return service.filterByCapacityGreaterThan(capacity);
    }

    public Map<String, List<Bogie>> getGroupedBogies() {
        return service.groupBogiesByType();
    }
}