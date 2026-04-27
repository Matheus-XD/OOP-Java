package calculate_area;

public class Main {
    public static void main(String[] args) {

        GeometricShape[] shapes = {
            new Square(4),
            new Circle(4),
            new Triangle(4, 6)
        };

        for(int i = 0; i < shapes.length; i++){

            System.out.println(shapes[i].calculateArea());
        }


    }
}
