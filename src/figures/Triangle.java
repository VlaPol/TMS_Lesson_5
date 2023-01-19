package figures;

public class Triangle extends Figure{

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    double perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    double area() {
        double p = 1./2 * (firstSide +secondSide + thirdSide);
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }
}
