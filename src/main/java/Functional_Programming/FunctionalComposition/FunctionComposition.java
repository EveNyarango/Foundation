package Functional_Programming.FunctionalComposition;

import java.util.function.Function;

public class FunctionComposition {

    public static void main(String[] args) {
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add = (value) -> value + 3;

        Function<Integer, Integer> addMultiply = multiply.compose(add);
        Integer result = addMultiply.apply(4);
        System.out.println(result);

//        andThen()
        Function<Integer, Integer> addThenMultiply = multiply.andThen(add);
        Integer result1 = addThenMultiply.apply(4);
        System.out.println(result1);

    }
}
