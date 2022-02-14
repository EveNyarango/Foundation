package oi.turntabl.functional_programming.functional_interface;
import java.util.function.UnaryOperator;

public class ThinkUnary {

    public static void main(String[] args) {
        UnaryOperator<Integer> adderNumber = (Integer number) -> number + 5;
        Integer  result = adderNumber.apply(20);
        System.out.println(result);
    }
}
