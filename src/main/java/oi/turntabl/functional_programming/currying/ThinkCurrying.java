package oi.turntabl.functional_programming.currying;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ThinkCurrying {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Function<Integer,Integer>> curryAdder = (u,v) -> w -> u + v +w;
        System.out.println("Add 2 + 3 + 5: " + curryAdder
                .apply(2,3)
                .apply(5));

        Function<Integer, Function<Integer,Integer>> curryMultiplier = u -> v -> u * v;
        System.out.println("Add 2 * 5: " + curryMultiplier
                .apply(2)
                .apply(5));
    }
}
