package oi.turntabl.functional_programming.functional_composition;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateComposition {

    public static void main(String[] args) {
        String input = "An apple a day";
        String input2 =  "relax";

        Predicate<String> startWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX = (text) -> text.endsWith("x");
        boolean checkA = startWithA.test(input);
        System.out.println(checkA);

        BiPredicate<String,String> startsWithAAndEndWithX = (text, text2) -> startWithA.test(text) && endsWithX.test(text2);
        boolean result = startsWithAAndEndWithX.test(input, input2);
        System.out.println(result);

    }
}
