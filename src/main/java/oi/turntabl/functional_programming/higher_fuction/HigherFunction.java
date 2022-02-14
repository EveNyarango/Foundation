package oi.turntabl.functional_programming.higher_fuction;

import java.util.function.Function;

public class HigherFunction {
    /**
     *Higher-order function; functions that take other functions as arguments or return other functions
     */
    public static int sumOfNumbers(Function<Integer, Integer> operation, int a, int b){
    System.out.println(a + b);
    return operation.apply(a) + operation.apply(b);
}

//    public static int sumOfSquareNumbers(int x, int y){
//        return sumOfNumbers(x*x, y*y);
//    }
//
//    public static void main(String[] args) {
//        sumOfNumbers(2,4);
//    }
}
