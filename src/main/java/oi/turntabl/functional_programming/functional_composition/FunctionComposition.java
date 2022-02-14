package oi.turntabl.functional_programming.functional_composition;

import java.util.function.Function;

public class FunctionComposition {

    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByValue = (value) -> value * 2;
        Function<Integer, Integer> add = (value) -> value + 3;

        Function<Integer, Integer> addMultiply = multiplyByValue.compose(add);
        Integer result = addMultiply.apply(4);
        System.out.println(result);

//        andThen()
        Function<Integer, Integer> addThenMultiply = multiplyByValue.andThen(add);
        Integer result1 = addThenMultiply.apply(4);
        System.out.println(result1);

//        f(x) = g(h(x)) compose is bottom up***

        Function<Integer, Integer> g = (value) -> value * 2;
        Function<Integer, Integer> h = (value) -> value + 3;
        Function<Integer, Integer> x = (value) -> value - 3;

        Integer composed =g.compose(h).compose(x).apply(5);
        System.out.println("g(h(x)): " +composed);
    }
}
