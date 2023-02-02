package com.example.lab_4_codecatchers;

public class Shape {
    protected int x, y;
    protected String color;
    public Shape() {
        this.x = 0;
        this.y = 0;
        this.color = "Yellow";
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
