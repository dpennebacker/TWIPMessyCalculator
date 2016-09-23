package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator App");
        System.out.println("Would you like to add, subtract, divide or multiply?");
        Scanner  kbInput = new Scanner (System.in);
        String response = kbInput.next();

        if(response.equals("add"))
        {
            System.out.println("Enter the first of two numbers to add");
            double num1 = kbInput.nextDouble();
            System.out.println("Enter the second of two numbers to add");
            double num2 = kbInput.nextDouble();
            double answer = Math.sqrt(num1 + num2);
            System.out.println("Your sum is: "+ answer);
            System.out.println("Are you happy with your answer (Y)es or (N)o");
            String finalResponse = kbInput.next();
            if(finalResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Yep. Alright then. Goodbye!");
            }
            else
            {
                System.out.println("So you think I am off. What math class function did I run your answer through?");
                String guess = kbInput.next();
                if(guess.equalsIgnoreCase("sqrt"))
                    System.out.println("Yes! You are correct! " + guess + " is what I did!");
                else
                {
                    System.out.println("Nope! Run the program again to see if you get it right");
                }
            }
        }

        else if(response.equals("subtract"))
        {
            System.out.println("Enter the first of two numbers to subtract");
            double num1 = kbInput.nextDouble();
            System.out.println("Enter the second of two numbers to subtract");
            double num2 = kbInput.nextDouble();
            double answer = Math.sqrt(num1 - num2);
            System.out.println("Your difference is: "+ answer);
            System.out.println("Are you happy with your answer (Y)es or (N)o");
            String finalResponse = kbInput.next();
            if(finalResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Yep. Alright then. Goodbye!");
            }
            else
            {
                System.out.println("So you think I am off. What math class function did I run your answer through?");
                String guess = kbInput.next();
                if(guess.equalsIgnoreCase("sqrt"))
                    System.out.println("Yes! You are correct! " + guess + " is what I did!");
                else
                {
                    System.out.println("Nope! Run the program again to see if you get it right");
                }
            }
        }

        else if(response.equals("divide"))
        {
            System.out.println("Enter the first of two numbers to divide");
            double num1 = kbInput.nextDouble();
            System.out.println("Enter the second of two numbers to divide");
            double num2 = kbInput.nextDouble();
            double answer = Math.sqrt(num1 / num2);
            System.out.println("Your quotient is: "+ answer);
            System.out.println("Are you happy with your answer (Y)es or (N)o");
            String finalResponse = kbInput.next();
            if(finalResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Yep. Alright then. Goodbye!");
            }
            else
            {
                System.out.println("So you think I am off. What math class function did I run your answer through?");
                String guess = kbInput.next();
                if(guess.equalsIgnoreCase("sqrt"))
                    System.out.println("Yes! You are correct! " + guess + " is what I did!");
                else
                {
                    System.out.println("Nope! Run the program again to see if you get it right");
                }
            }
        }

        else if(response.equals("multiply"))
        {
            System.out.println("Enter the first of two numbers to multiply");
            double num1 = kbInput.nextDouble();
            System.out.println("Enter the second of two numbers to multiply");
            double num2 = kbInput.nextDouble();
            double answer = Math.sqrt(num1 / num2);
            System.out.println("Your product is: "+ answer);
            System.out.println("Are you happy with your answer (Y)es or (N)o");
            String finalResponse = kbInput.next();
            if(finalResponse.equalsIgnoreCase("Y"))
            {
                System.out.println("Yep. Alright then. Goodbye!");
            }
            else
            {
                System.out.println("So you think I am off. What math class function did I run your answer through?");
                String guess = kbInput.next();
                if(guess.equalsIgnoreCase("sqrt"))
                    System.out.println("Yes! You are correct! " + guess + " is what I did!");
                else
                {
                    System.out.println("Nope! Run the program again to see if you get it right");
                }
            }
        }    }
}
