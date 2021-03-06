package oi.turntabl.functional_programming.immutability;

final public class ImmutableClass {

//    Declare public final for the variable
    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(5, "Java");
        System.out.println("My favourite programming language is" + immutableClass.name);

    }
}
