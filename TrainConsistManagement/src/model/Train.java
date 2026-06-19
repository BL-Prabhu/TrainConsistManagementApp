package model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Train {

    private final LinkedHashSet<String> bogies = new LinkedHashSet<>();

    public Set<String> getBogies() {
        return bogies;
    }
}