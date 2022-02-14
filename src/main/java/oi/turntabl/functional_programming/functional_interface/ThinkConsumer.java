package oi.turntabl.functional_programming.functional_interface;

import java.util.function.Consumer;

public class ThinkConsumer {
    public static void main(String[] args) {
        Consumer<String> toppingName = (String name)
                -> System.out.println("Go for " + name + " topping");
        toppingName.accept("caramel");
    }
}
