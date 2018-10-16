package com.marty;

public class Sofa extends Furniture {
    private String model;
    private boolean sofaBed;

    public Sofa(String colour, boolean isWooden, boolean isMetal, String model, boolean sofaBed) {
        super(colour, "sitting", 4, isWooden, isMetal);
        this.model = model;
        this.sofaBed = sofaBed;
    }
}
