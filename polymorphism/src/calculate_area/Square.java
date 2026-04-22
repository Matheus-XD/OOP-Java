package calculate_area;

public class Square extends GeometricShape{
        private double side;

        
        public Square(double side) {
                this.side = side;
        }

        @Override
        public String calculateArea() {
                this.area = side * side;
                return "Area of the square: " + area;
        }

}
