package oi.turntabl.functional_programming.recursion;

public class Addition {
    public static int sumFirstNthNumbers( int n){
        if( n<= 1){
            return n;
        }
        else{
            return n + sumFirstNthNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstNthNumbers(1000000));
    }
}
