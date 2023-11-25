/* Write program and add all group members names in to array and iterates
through for each loop and print your name.*/

package Programmes;

import java.util.ArrayList;

public class Test10 {

    public static void main(String[] args) {



        ArrayList<String> name = new ArrayList<String>();
        name.add("Sonal");
        name.add("Ayan");
        name.add("Zarna");
        name.add("Miten");
        name.add("Pankti");

        for (String a: name) {
            if (a.equalsIgnoreCase("Pankti")) {
                System.out.println(a);
            }
        }


    }
            
        }


