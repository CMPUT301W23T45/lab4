package com.example.lab_4_codecatchers;

public class Rectangle extends Shape{
    private int width, height;
    public Rectangle() {
        super();
        this.width = 1;
        this.height = 2;
    }
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;

    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public boolean isNotSquare() {
        return this.width != this.height;
    }
    public int getArea() {
        return this.width * this.height;
    }
    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

}
