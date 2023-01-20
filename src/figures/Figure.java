package figures;

public abstract class Figure {

    abstract double perimeter();
    abstract double area();
    void showInfo(Figure figure){
        System.out.println(figure.getClass().getSimpleName() + " area is: " + figure.area() + " and perimeter is:  " + figure.perimeter());
    }
}
