package edu.upi.rumahcerdas.model;

import java.io.Serializable;

public abstract class ExploreModel implements Serializable {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
