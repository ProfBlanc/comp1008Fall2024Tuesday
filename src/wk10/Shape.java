package wk10;

public abstract class Shape {

    private int sides;
    private double radius, diameter;

    public abstract double perimeter();
    public abstract double area();

    public Shape(){}

    public Shape(int sides, double radius, double diameter){
        setSides(sides);
        setRadius(radius);
        setDiameter(diameter);
    }
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
