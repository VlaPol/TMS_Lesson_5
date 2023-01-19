package figures;

public class Circle extends Figure{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return Math.round(2*Math.PI*radius);
    }

    @Override
    double area() {
        return Math.round(Math.PI*Math.pow(radius,2));
    }
}
