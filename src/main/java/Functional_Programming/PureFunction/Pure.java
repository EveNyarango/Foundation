package Functional_Programming.PureFunction;

import java.util.Arrays;

public class Pure {
    /**
     * Pure function; functions not affected by anything outside the function
     * Pure function;Return value solely depends on its arguments
     * Can not be modified
     * Does not have side effects
     */
    public static String oddOrEven(int y){
        System.out.println(y%2==0?"even": "odd");
        return y%2==0?"even": "odd";
    }
    private static int count = 10;
    private static int[] array ={3,8,4,1,9};

    public static int increment(){
        System.out.println(count+1);
        return count+1;
    }

    public static  void arraySort(){
        Arrays.stream(array).sorted().forEach(System.out::println);
    }

    /**
     * Stream.reduce() combine elements of a stream and produces a single value.
     */

    public static int sumOfArray(){
        int sum = Arrays.stream(array).reduce(0, (current, next) -> current + next);
        return sum;
    }

//    option 2 - method reference
public static int sumOfArray2(){
    int sum = Arrays.stream(array).reduce(0, (Integer::sum));
    return sum;
}

    public static void main(String[] args) {
        oddOrEven(20);
        increment();
        arraySort();
        System.out.println("Sum of arrays "   + sumOfArray());
    }

}
