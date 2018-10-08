package test_package;

public class Runner {


    public static void main(String[] args) {

        ClassLoader classLoader = Runner.class.getClassLoader();
        String sourceFile = classLoader.getResource("shapes.properties").getPath();

        PropertyReader prop = new PropertyReader(sourceFile);

        Parallelogram p = new Parallelogram(Double.parseDouble(prop.getProperty("parallelogramA")),
                Double.parseDouble(prop.getProperty("parallelogramB")),
                Double.parseDouble(prop.getProperty("parallelogramH")));
        Square s = new Square(Double.parseDouble(prop.getProperty("squareA")));
        System.out.println(p);
        System.out.println(s);
        System.out.println(p.area());
        System.out.println(s.area());

    }
}
