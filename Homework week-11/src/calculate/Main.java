package calculate;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        char Symbol;
        int a,b, result=0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        Symbol = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        a = input.nextInt();

        System.out.println("Enter second number");
        b= input.nextInt();

        switch (Symbol) {

            // performs addition between numbers
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();



    }
}



