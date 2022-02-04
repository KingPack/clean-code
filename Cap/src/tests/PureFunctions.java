package Cap.src.tests;

import java.util.Random;

// This is a test java functional JDK

public class PureFunctions {
    
    public static int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public static int impureSubtract(int a, int b) {
        int result = new Random().nextInt() - a -b;

        return result;
    }

    public static int pureSubtract(int a, int b) {
        int result = a - b;

        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;

        return result;
    }
    public static void main(String[] args) {

        int value_one = 5;
        int value_two = 10;

        System.out.println("Sum : " + sum(value_one, value_two));

        System.out.println("Multiply : " + multiply(value_one, value_two));

        System.out.println("Pure Subtraction : " + value_one + " - " + value_two  + " = " + pureSubtract(value_one, value_two));

        System.out.println("Impure Subtraction : " + impureSubtract(value_one, value_two));

    }
}
