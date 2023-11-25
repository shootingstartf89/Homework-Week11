/*Write a Java program to iterate through all elements in an array list using
Iterator.*/

package Programmes;

import java.util.Arrays;
import java.util.List;

public class Test4 {

    public static void main(String[] args)
    {

        List<Integer> numbers
                = Arrays.asList(10, 30, 40, 60, 80,90);


        for (Integer i : numbers)


            System.out.print(i + " ");
    }


}
