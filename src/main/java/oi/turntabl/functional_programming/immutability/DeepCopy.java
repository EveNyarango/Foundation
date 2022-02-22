package oi.turntabl.functional_programming.immutability;

public class DeepCopy {

    private final int id;
    private final String name;
    private final Engine engine;

    public DeepCopy(int id, String name, Engine engine) {
        this.id = id;
        this.name = name;
        Engine newEngine = new Engine(engine.speed);
        this.engine = newEngine;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Engine engine = new Engine(50);
        DeepCopy deepCopy = new DeepCopy(1, "Java", engine);
        System.out.println("I love " + deepCopy.name);
        engine.speed = 70;
        System.out.println(deepCopy.engine.speed);
    }
}
