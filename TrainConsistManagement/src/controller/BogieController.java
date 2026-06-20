package controller;

import model.Bogie;
import service.BogieService;
import service.BogieServiceImpl;

import java.util.List;

public class BogieController {

    private final BogieService service;

    public BogieController() {
        this.service = new BogieServiceImpl();
    }

    public void addBogie(String name, int capacity) {
        service.addBogie(new Bogie(name, capacity));
    }

    public List<Bogie> getAllBogies() {
        return service.getAllBogies();
    }

    public List<Bogie> getSortedAscending() {
        return service.sortByCapacityAscending();
    }

    public List<Bogie> getSortedDescending() {
        return service.sortByCapacityDescending();
    }

    // UC8
    public List<Bogie> getFilteredBogies(int capacity) {
        return service.filterByCapacityGreaterThan(capacity);
    }
}