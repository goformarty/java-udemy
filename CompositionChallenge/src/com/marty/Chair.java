package com.marty;

public class Chair extends Furniture{
    private String model;
    private boolean hasBack;
    private boolean hasArmRests;

    public Chair(String colour, boolean isWooden, boolean isMetal, String model, boolean hasBack, boolean hasArmRests) {
        super(colour, "sitting,", 4, isWooden, isMetal);
        this.model = model;
        this.hasBack = hasBack;
        this.hasArmRests = hasArmRests;
    }
}
