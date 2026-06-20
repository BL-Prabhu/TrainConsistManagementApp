package service;

import model.Bogie;
import java.util.List;
import java.util.Map;

public interface BogieService {

    void addBogie(Bogie bogie);

    List<Bogie> getAllBogies();

    List<Bogie> filterByCapacityGreaterThan(int capacity);

    // UC9
    Map<String, List<Bogie>> groupBogiesByType();
}