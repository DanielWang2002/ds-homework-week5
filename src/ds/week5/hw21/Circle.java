package ds.week5.hw21;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        this.setRadius(1.0);
        this.setColor("red");
    }

    public Circle(double radius) {
        this.setRadius(radius);
        this.setColor("red");
    }

    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "sss";
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
