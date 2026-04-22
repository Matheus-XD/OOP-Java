package calculate_area;

public class Circle extends GeometricShape{
    private double radious;

    public Circle( double radious){
        this.radious = radious ;
    }

    public String calculateArea(){
        this.area = 3.14 * (this.radious * this.radious);
        return "Area of the circle: " + this.area;
    }
    
}
