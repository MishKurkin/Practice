package Object_Oriented;

import java.awt.*;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 3;
        this.length = 4;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return width + length + width + length;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
