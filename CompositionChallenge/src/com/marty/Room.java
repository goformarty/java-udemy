package com.marty;

public class Room {
    private int walls;
    private int doors;
    private int windows;

    private Sofa sofa;
    private Chair chair;
    private Cupboard cupboard;

    public Room(int walls, int doors, int windows, Sofa sofa, Chair chair, Cupboard cupboard) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.sofa = sofa;
        this.chair = chair;
        this.cupboard = cupboard;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Chair getChair() {
        return chair;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }
}
