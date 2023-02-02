package com.example.lab_4_codecatchers;

public class Square extends Shape {
    private int side = 1; //sets initial side value to 1

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea(int side){
        int area  = side*side;
        return area;
    }
}
