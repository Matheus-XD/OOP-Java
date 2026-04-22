package calculate_area;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);
        Circle c = new Circle(4);
        Triangle t = new Triangle(4, 6);

        System.out.println(s.calculateArea());
        System.out.println(c.calculateArea());
        System.out.println(t.calculateArea());

    }
}
