package calculate_area;

public class Triangle extends GeometricShape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String calculateArea() {
       this.area = (base * height)/2;
       return "Area of the triangle: " + area;
    }
    
}
