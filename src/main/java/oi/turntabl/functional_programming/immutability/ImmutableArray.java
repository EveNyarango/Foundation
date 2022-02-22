package oi.turntabl.functional_programming.immutability;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableArray{

    public static void main(String[] args) {
        //    mutable array
        int[] numbers = new int[]{5, 7, 5, 9, 7};
        numbers[4] = 10;

        System.out.println(numbers[4]);

//        making array immutable with a different data type
//        array of students
        String student[] = {"Linda", "Amani", "Amanda", "Hawa"};
//        converting string array to list of object
        List<String> studentList = Arrays.asList(student);
//        Convert the list into an immutable
        List<String> immutable = Collections.unmodifiableList(studentList);
//        print
        System.out.println(immutable);
    }
}
