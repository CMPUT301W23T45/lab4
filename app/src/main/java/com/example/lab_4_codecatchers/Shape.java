package com.example.lab_4_codecatchers;

public abstract class Shape {
    protected int x, y;
    public Shape() {
        this.x = 0;
        this.y = 0;
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
