package oi.turntabl.functional_programming.functional_interface;

public class Toyota implements Car {
    String name = "RAV4";

    @Override
    public String drive() {
        return "I love a " + name;
    }
}


