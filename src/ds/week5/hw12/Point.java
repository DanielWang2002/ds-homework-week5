package ds.week5.hw12;

public class Point {

    private int x = 0;
    private int y = 0;

    public Point() {
        this.setX(0);
        this.setY(0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() { return String.format("(%s, %s)", this.x, this.y); }

    public int[] getXY() { return new int[] {this.x, this.y}; }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x , int y) {
        return Math.pow(Math.pow(this.x - x, 2) + (Math.pow(this.y - y, 2)), 0.5);
    }

    public double distance(Point another) {
        return Math.pow(Math.pow(this.x - another.x, 2) + (Math.pow(this.y - another.y, 2)), 0.5);
    }

    public double distance() {
        return Math.pow(Math.pow(this.x, 2) + (Math.pow(this.y, 2)), 0.5);
    }

}
