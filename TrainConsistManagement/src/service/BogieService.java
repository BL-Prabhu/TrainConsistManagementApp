package service;

import model.Bogie;
import java.util.List;

public interface BogieService {

    void addBogie(Bogie bogie);

    List<Bogie> getAllBogies();

    List<Bogie> sortByCapacityAscending();

    List<Bogie> sortByCapacityDescending();

    // UC8
    List<Bogie> filterByCapacityGreaterThan(int capacity);
}