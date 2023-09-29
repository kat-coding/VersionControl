package making_changes;

import java.util.HashMap;
import java.util.Objects;

public class Point {
    private double a;
    private double b;

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
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
        return Double.compare(getA(), point.getA()) == 0 && Double.compare(getB(), point.getB()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }
}
