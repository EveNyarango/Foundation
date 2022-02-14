package oi.turntabl.functional_programming.pure_function;

import java.util.Arrays;

public class Pure {
    /**
     * Pure function; functions not affected by anything outside the function
     * Pure function;Return value solely depends on its arguments
     * Can not be modified
     * Does not have side effects
     */

    public static String isEven(int y) {
        return y % 2 == 0 ? "even" : "odd";
    }



    private static int[] array = {3, 8, 4, 1, 9};

    //impure function
    private static int count = 10;

    public static int increment() {
        return count + 1;
    }

    public static void main(String[] args) {
        increment();
    }

    public static void sortArray() {
        Arrays.stream(array).sorted().forEach(System.out::println);
    }

    /**
     * Stream.reduce() combine elements of a stream and produces a single value.
     */

    public static int sumOfArray() {
        int sum = Arrays.stream(array).reduce(0, (current, next) -> current + next);
        return sum;
    }

    //    option 2 - method reference
    public static int sumOfArray2() {
        int sum = Arrays.stream(array).reduce(0, (Integer::sum));
        return sum;
    }


}
