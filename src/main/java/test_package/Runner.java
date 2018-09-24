package test_package;

public class Runner {
    public static void main(String[] args) {

        Parallelogram p = new Parallelogram(1,2,3);
        Square s = new Square(2);
        System.out.println(p);
        System.out.println(s);
        System.out.println(p.area());
        System.out.println(s.area());

    }
}
