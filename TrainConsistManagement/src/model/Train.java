package model;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents Train consist using LinkedList.
 */
public class Train {

    private final LinkedList<String> bogies = new LinkedList<>();

    public List<String> getBogies() {
        return bogies;
    }
}