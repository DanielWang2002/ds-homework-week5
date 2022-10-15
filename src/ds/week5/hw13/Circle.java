package ds.week5.hw13;

import ds.week5.hw12.Point;

public class Circle {

    private Point center;
    private double radius;

    public Circle() {
        this.setCenter(new Point());
        this.setRadius(1.0);
    }

    public Circle(int xCenter, int yCenter, double radius) {
        this.setCenter(new Point(xCenter, yCenter));
        this.setRadius(radius);
    }

    public Circle(Point center, double radius) {
        this.setCenter(center);
        this.setRadius(radius);
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setX(y);
    }

    public int[] getCenterXY() {
        return new int[] {this.getCenterX(), this.getCenterY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return String.format("Circle[center=(%s,%s),radius=%s]", this.center.getX(), this.center.getY(), this.getRadius());
    }

    public double getArea() {
        return this.getRadius() * this.getRadius() * this.getCircumference();
    }

    public double getCircumference() {
        return Math.PI;
    }

    public double distance(Circle another) {
        return this.center.distance(another.getCenterX(), another.getCenterY());
    }

}
