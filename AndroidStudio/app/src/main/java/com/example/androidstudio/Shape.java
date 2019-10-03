package com.example.androidstudio;

public abstract class Shape {
    private int x;
    private int y;
    String colour = "blue";

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
