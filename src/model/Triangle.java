package model;

public class Triangle extends Shape {
    public int base;
    public int height;

    public Triangle() {}

    public Triangle(Triangle source) {
        super(source);
        if (source != null) {
            this.base = source.base;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Triangle(this);
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", " + super.toString() + "]";
    }
}