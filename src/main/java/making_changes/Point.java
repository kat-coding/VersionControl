package making_changes;

import java.util.Objects;

/**
 * @author Katherine Watkins
 * SDEV 372
 * 9/29/2023
 * Friday Lab #1
 */
public class Point {
    private double a;
    private double b;
    private double c;

    public Point(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(getA(), point.getA()) == 0 && Double.compare(getB(), point.getB()) == 0 && Double.compare(getC(), point.getC()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
