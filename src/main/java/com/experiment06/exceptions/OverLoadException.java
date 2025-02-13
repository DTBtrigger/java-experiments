package com.experiment06.exceptions;

public class OverLoadException extends Exception{
    private int shipId;
    private String shipName;
    private double overWeight;

    public OverLoadException(int shipId, String shipName, double overWeight){
        super("Ship" + shipId + ":" + shipName + "\n"+ "超载" + overWeight);
        this.shipId = shipId;
        this.shipName = shipName;
        this.overWeight = overWeight;
    }

    public int getShipId() {
        return shipId;
    }

    public String getShipName() {
        return shipName;
    }

    public double getOverWeight() {
        return overWeight;
    }
}
