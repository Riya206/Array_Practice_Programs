package com.kce.coding;

import java.util.Scanner;

public class Caculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");


            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Choose operation: ");
            int choice = sc.nextInt();

            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting calculator");
                break;
            }
            double result = 0;

            switch (choice) {

                case 1:
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}