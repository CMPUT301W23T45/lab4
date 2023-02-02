package com.example.lab_4_codecatchers;

public abstract class Circle extends Shape { //Abstract Class that extends our Shape Class.
    private int radius; //Private variable that will store the radius of the circle.
    public Circle() { //Initialize Circle object with default values.
        super();
        this.radius = 1; //Default radius is set to 1.
    }

    public Circle(int x, int y, int radius) { //Definition of constructor for circle class.
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() { //Getter
        return this.radius;
    }

    public void setRadius(int radius) { //Setter
        this.radius = radius;
    }
}
