package calculate;

import java.util.Scanner;

public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Addition of a and b is");
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of a and b is");
    }

    public void mutiplication(int a, int b) {
        System.out.println("Multiplication of a and b is");
    }

    public void division(int a, int b) {
        System.out.println("Division of a and b is");
    }

    public int calculateResult(int a, int b, char symbol) {
        // char Symbol;
        //int a,b,
        int result=0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        symbol = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        a = input.nextInt();

        System.out.println("Enter second number");
        b = input.nextInt();

        switch (symbol) {

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
        int result1=result;
        return result;
    }
}





