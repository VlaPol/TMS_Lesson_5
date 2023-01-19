package figures;

/**
 *  Написать иерархию классов «Фигуры».
 *  Фигура(абстрактный класс) -> Треугольник, Прямоугольник, Круг.
 *  Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
 *  Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.
 */
public class TestClass {

    public static void main(String[] args) {

        Figure rect = new Rectangle(10,4.2);
        Figure triagle = new Triangle(3,4,5);
        Figure circle = new Circle(2.5);
        Figure rect2 = new Rectangle(10,4.2);
        Figure triagle2 = new Triangle(3,4,5);

        System.out.println("Rectangle area is: " + rect.area() + " and perimeter is:  " + rect.perimeter());
        System.out.println("Triangle area is: " + triagle.area() + " and perimeter is:  " + triagle.perimeter());
        System.out.println("Circle area is: " + Math.round(circle.area()) + " and perimeter is:  " + circle.perimeter());

        Figure [] array = new Figure[5];
        array[0] = rect;
        array[1] = rect2;
        array[2] = triagle;
        array[3] = circle;
        array[4] = triagle2;

        double sum = 0;
        for(Figure itm: array){
            sum += itm.perimeter();
        }

        System.out.println("Total perimeter is: " + sum);

    }
}
