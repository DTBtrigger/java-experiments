package com.example01.entity;

import com.example01.resourse.DatabaseUtils;

import java.util.ArrayList;
import java.util.List;

public class Apple {
    public enum Color{
        RED,GREEN
    }

    private int id;
    private Color color;
    private  int weight;

    public Apple(int id, Color color, int weight) {
        this.id = id;
        this.color = color;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", color=" + color +
                ", weight=" + weight +
                '}';
    }
}
