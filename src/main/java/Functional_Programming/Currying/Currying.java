package Functional_Programming.Currying;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Currying {
    private UnaryOperator<Integer> adderGenerator(final int adderValue){
        return (x) -> x + adderValue;
    }

    private UnaryOperator<Integer> multiplierGenerator(final int adderValue){
        return (x) -> x * adderValue;
    }

    private Consumer<String> displayComposer(final Consumer<String> displayer){
        return (x) -> displayer.accept(x);
    }

    private void designerDisplay(final String value){
        System.out.println("***************");
        System.out.println(value);
        System.out.println("****************");
    }
    public static void main(String[] args) {

        final Currying curry = new Currying();
        final UnaryOperator<Integer> addTwoCurry = curry.adderGenerator(2);
        final UnaryOperator<Integer> multiplyBy100 = curry.multiplierGenerator(100);

        final Consumer<String> printToConsole = curry.displayComposer(System.out::println);
        final Consumer<String> printNoNewLineToConsole = curry.displayComposer(System.out::print);
        final Consumer<String> designerDisplay = curry.displayComposer(curry::designerDisplay);

        printToConsole.accept("Add to 2 = " + addTwoCurry.apply(2));
        System.out.println("Add to 3 = " + addTwoCurry.apply(3));
        System.out.println("Add to 4 = " + addTwoCurry.apply(4));

        printNoNewLineToConsole.accept("Multiply by 2 = " + multiplyBy100.apply(2));
        designerDisplay.accept("Multiply by 3 = " + multiplyBy100.apply(3));
        System.out.println("Multiply by 4 = " + multiplyBy100.apply(4));
    }
}
