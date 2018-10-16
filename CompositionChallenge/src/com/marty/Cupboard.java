package com.marty;

public class Cupboard extends Furniture {
    private int drawers;
    private int doors;

    public Cupboard(String colour, boolean isWooden, boolean isMetal, int drawers, int doors) {
        super(colour, "storage", 4, isWooden, isMetal);
        this.drawers = drawers;
        this.doors = doors;
    }

    public void openDrawer() {
        openDoor();
        System.out.println("Inside drawer is open");
    }

    private void openDoor() {
        System.out.println("Door is open");
    }
}
