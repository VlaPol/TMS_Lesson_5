package employees;

/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название
 * должности и имплементировать этот метод в созданные классы.
 */
public class TestClass {

    public static void main(String[] args) {

        Printable dir = new Director("John");
        dir.printer(dir.getClass().getSimpleName());

        Printable emp = new Employee("Tim");
        emp.printer(emp.getClass().getSimpleName());

        Printable acc = new Accountant("Serg");
        acc.printer(acc.getClass().getSimpleName());
    }
}
