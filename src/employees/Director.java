package employees;

public class Director implements Printable{

    private final String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void printer(String position) {
        System.out.println("Hi, my name is " + name + ". I'm working as " + position);
    }
}
