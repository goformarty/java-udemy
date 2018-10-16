package com.marty;

public class Furniture {
    private String colour;
    private String purpose;
    private int legs;
    private boolean isWooden;
    private boolean isMetal;

    public Furniture(String colour, String purpose, int legs, boolean isWooden, boolean isMetal) {
        this.colour = colour;
        this.purpose = purpose;
        this.legs = legs;
        this.isWooden = isWooden;
        this.isMetal = isMetal;
    }

    public String getColour() {
        return colour;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isWooden() {
        return isWooden;
    }

    public boolean isMetal() {
        return isMetal;
    }
}
