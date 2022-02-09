package Functional_Programming.Recursion;

public class TailRecursion {

   private static int fact(int n, int result){
//        base terminator
        if(n <= 1){
            return result;
        }
        else{
            return fact(n-1, n*result);
        }

    }

    public static int factorial(int n){
       return fact(n, 1);

    }

    public static void main(String[] args) {
        System.out.println(factorial(100000));
    }
}
