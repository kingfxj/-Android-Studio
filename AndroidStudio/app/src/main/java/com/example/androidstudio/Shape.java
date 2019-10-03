package com.example.androidstudio;

public abstract class Shape {
    private int x;
    private int y;
<<<<<<< HEAD
    String color = "blue";
=======
    private String colour = "$PUT_YOUR_CHOICE_OF_COLOR";

>>>>>>> 45f0b390b3efd016d78aab02f40648f25eddfd8a
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
