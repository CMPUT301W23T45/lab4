package com.example.lab_4_codecatchers;

public class Triangle extends Shape{
    private int base;
    private int height;
    private int area;

    public Triangle(int base, int height) {
        super(base, height);
        this.base = base;
        this.height = height;
        this.area = (base * height)/2;
    }

    public Triangle() {
        super();
        this.base = 1;
        this.height = 2;
        this.area = (base * height)/2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
        this.area = (base * height)/2;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.area = (base * height)/2;
    }

    public int getArea() {
        return area;
    }
}
