package oi.turntabl.functional_programming.recursion;

public class Factorial {

    public static int fact(int n){
//        base terminator
        if(n <= 1){
            return n;
        }
        else{
            return n * fact(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
