package test_package;

import org.apache.log4j.Logger;

public class Square extends Shape {

    private static Logger logger = Logger.getLogger(Parallelogram.class);
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double area() {
        logger.info("Calculating parallelogram area");
        return a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
