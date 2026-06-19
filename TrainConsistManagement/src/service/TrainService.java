package service;

import java.util.Set;

/**
 * Service interface for UC5
 */
public interface TrainService {

    void addBogie(String bogie);

    Set<String> getFormation();
}