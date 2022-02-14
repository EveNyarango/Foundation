package oi.turntabl.functional_programming;

import oi.turntabl.functional_programming.functional_interface.Car;

public class Main {
    public static void main(String[] args) {
//        anonymous class
        String name = "RAV4";
        Car car = new Car() {
            @Override
            public String drive() {
                return "I love a " + name;
            }
        };

    }
}
