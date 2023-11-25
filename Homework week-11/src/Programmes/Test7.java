/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/

package Programmes;

import java.util.HashMap;

public class Test7 {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> city = new HashMap<String, Integer>();


        // Add keys and values (City, Code)
        city.put("Jungadh", 11);
        city.put("Ahmedabad",01 );
        city.put("Valsad", 15);
        city.put("Nadiad", 07);
        city.put("Vadodara",06);

        for (String i : city.keySet()) {
            System.out.println("key: " + i + " value: " + city.get(i));
        }
    }
}


