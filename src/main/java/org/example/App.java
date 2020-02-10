package org.example;

import org.example.Calculator.Calculator;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        float firstNumber = sc.nextFloat();

        System.out.println("Enter operation to be performed : ");
        char operation = sc.next().charAt(0);

        System.out.println("Enter second number : ");
        float secondNumber = sc.nextFloat();

        Calculator calculate = new Calculator(firstNumber, operation, secondNumber);
        float result = calculate.displayResult();

        if(result == -1)
            System.out.println("Invalid Operation");
        else
            System.out.println("Result is "+ result);
    }
}
