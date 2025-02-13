package com.experiment06;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int id;
    private String name;
    private double load;
    private List<Container> containers;

    public Ship(int id, String name, double load) {
        this.id = id;
        this.name = name;
        this.load = load;
        this.containers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void addContainers(Container container) {
        containers.add(container);
    }
}
