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

        int VALUE_ONE = 5;
        int VALUE_TWO = 10;

        System.out.println("Sum : " + VALUE_ONE + " + " + VALUE_TWO + " = " + sum(VALUE_ONE, VALUE_TWO));

        System.out.println("Multiply : " + VALUE_ONE + " * " + VALUE_TWO + " = "  + multiply(VALUE_ONE, VALUE_TWO));

        System.out.println("Pure Subtraction : " + VALUE_ONE + " - " + VALUE_TWO  + " = " + pureSubtract(VALUE_ONE, VALUE_TWO));

        System.out.println("Impure Subtraction : " + impureSubtract(VALUE_ONE, VALUE_TWO));

    }
}
