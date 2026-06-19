package service;

import java.util.List;

/**
 * Service for managing train consist.
 */
public interface TrainService {

    void initialize();

    void insertAt(int index, String bogie);

    void removeFirst();

    void removeLast();

    List<String> getConsist();
}