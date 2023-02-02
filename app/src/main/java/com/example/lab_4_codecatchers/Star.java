package com.example.lab_4_codecatchers;

public class Star extends Shape {
    private int points;
    private float pointLength;
    private float rotation;

    public Star() {
        super();
        this.points = 5;
        this.pointLength = 1;
        this.rotation = 0;
    }

    public Star(int x, int y) {
        super(x, y);
        this.points = 5;
        this.pointLength = 1;
        this.rotation = 0;
    }

    public Star(int x, int y, int p, int l, int r) {
        super(x, y);
        this.points = p;
        this.pointLength = l;
        this.rotation = r % 360;
    }

    public int getPoints() { return this.points; }

    public void setPoints(int p) { this.points = p; }

    public float getPointLength() { return this.pointLength; }

    public void setPointLength(float l) { this.pointLength = l; }

    public float getRotation() { return this.rotation; }

    public void setRotation(float r) { this.rotation = r % 360; }
}
