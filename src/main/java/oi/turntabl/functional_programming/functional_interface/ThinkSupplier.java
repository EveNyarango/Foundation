package oi.turntabl.functional_programming.functional_interface;

import java.util.function.Supplier;

public class ThinkSupplier {

    public static void main(String[] args) {
        Supplier<String> flavours = () -> "vanilla, coffee, blackberry";
        String getFlavours = flavours.get();
        System.out.println(getFlavours);
    }
}
