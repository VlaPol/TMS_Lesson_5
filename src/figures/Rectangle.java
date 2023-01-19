package figures;

public class Rectangle extends Figure{

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }

    @Override
    double area() {
        return length * width;
    }
}
