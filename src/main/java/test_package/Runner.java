package test_package;

import org.aeonbits.owner.ConfigFactory;

public class Runner {
    private static AppProperties appProperties = ConfigFactory.create(AppProperties.class);

    public static void main(String[] args) {
        Parallelogram p = new Parallelogram(
                appProperties.parallelogramA(),
                appProperties.parallelogramB(),
                appProperties.parallelogramH());

        Square s = new Square(appProperties.squareA());
        System.out.println(p);
        System.out.println(s);
        System.out.println(p.area());
        System.out.println(s.area());

    }
}
