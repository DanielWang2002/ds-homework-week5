package ds.week5.hw12;

public class Line {

    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        setBegin(new Point(x1, y1));
        setEnd(new Point(x2, y2));
    }

    public Line(Point begin, Point end) {
        this.setBegin(begin);
        this.setEnd(end);
    }


    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int[] getBeginXY() {
        return new int[] {this.getBeginX(), this.getBeginY()};
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setX(y);
    }

    public int[] getEndXY() {
        return new int[] {this.end.getX(), this.end.getY()};
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public String toString() {
        return String.format("Line[begin=(%s,%s),end=(%s,%s)]", this.begin.getX(), this.begin.getY(), this.end.getX(), this.end.getY());
    }

    public double getLength() {
        return this.begin.distance(end);
    }



}
