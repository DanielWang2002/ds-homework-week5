package ds.week5.hw21;

public class Cylinder extends Circle{

    private double height;

    public Cylinder() {
        this.setHeight(1.0);
    }

    public Cylinder(double height) {
        this.setHeight(height);
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.setHeight(height);
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "sss";
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}
