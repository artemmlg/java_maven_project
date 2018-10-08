package test_package;

import org.apache.log4j.Logger;

public class Parallelogram extends Shape {

    private static Logger logger = Logger.getLogger(Parallelogram.class);
    private double a;
    private double b;
    private double h;

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

    public double area() {
        logger.info("Calculating parallelogram area");
        return a * h;
    }

    @Override
    public String toString() {
        logger.debug("Calculating parallelogram area");
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
