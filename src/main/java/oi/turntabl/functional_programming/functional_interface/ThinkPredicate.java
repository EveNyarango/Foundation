package oi.turntabl.functional_programming.functional_interface;
import java.util.function.Predicate;

public class ThinkPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isAnAdult = (Integer age) -> age >= 16;
        System.out.println(isAnAdult.test(17));
        System.out.println(isAnAdult.test(10));
    }
}
