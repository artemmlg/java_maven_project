package test_package;

public class Parallelogram extends Shape {

    double a;
    double b;
    double h;

    public Parallelogram(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double area(){
        return a*h;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
