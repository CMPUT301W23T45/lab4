package com.example.lab_4_codecatchers;

public class Trapezoid extends Shape {
    private float top_length;
    private float base_length;
    private float height;

    public Trapezoid(int x, int y,float top_length,float base_length,float height) {
        super(x, y);
        this.top_length= top_length;
        this.base_length= base_length;
        this.height=height;

    }

    public void setTop_length(float top_length ) {
        this.top_length=top_length;
    }

    public void setBase_length(float base_length ) {
        this.base_length=base_length;
    }
    public void setHeight(float height ) {
        this.height=height;
    }

    public float getTop_length(){
        return this.top_length;
    }

    public float getBase_length(){
        return this.base_length;
    }
    public float getHeight(){
        return this.height;
    }

    public float getArea(){
        return (((this.top_length+this.base_length)/2)*this.height);
    }
}
