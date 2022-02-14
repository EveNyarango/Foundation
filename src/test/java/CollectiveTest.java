import oi.turntabl.functional_programming.higher_fuction.HigherFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CollectiveTest {
    @Test
    public void checkAccuracyOfSumOfNumbers(){
        Assertions.assertEquals(13, HigherFunction.sumOfNumbers((a -> a*a),2,3));
    }

    @Test
    public void checkAccuracyOfSumOfSquareNumbers(){
        Assertions.assertEquals(35, HigherFunction.sumOfNumbers((a -> a*a*a), 3,2));

//        stuff here
        BiFunction<Integer, Integer, String> sum = (a, b) -> Integer.toString(a+b);
        Consumer<String> print = System.out::println;
        print.accept("Kenya");
        Supplier test = () -> "Hello";
        System.out.println(test.get());
        Predicate<Integer> trial = a -> a%2==0;
        System.out.println(trial.test(5));
    }
}
