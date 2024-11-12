package wk10;

public class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double length, double width, int sides) {
        setLength(length);
        setWidth(width);
        setSides(sides);

    }
    public double perimeter(){

        return 2 * (length + width);
    }
    public double area(){
        return length * width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
