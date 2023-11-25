/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names */

package Programmes;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("India");
        c1.add("Australia");
        c1.add("SouthAfrica");
        c1.add("England");
        c1.add("UnitedStates");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
    }
}



