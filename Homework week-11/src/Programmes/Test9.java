/* Write program and add all group names in to array and iterates through for
each loop.*/

package Programmes;

import java.util.ArrayList;

public class Test9 {

    public static void main(String[] args)
    {


        ArrayList<String> gr = new ArrayList<String>();
        gr.add("Code1");
        gr.add("Code2");
        gr.add("Agile");
        gr.add("Postman");
        gr.add("Scrum");


        for (String i :gr)


            System.out.print(i + " ");
    }
}
