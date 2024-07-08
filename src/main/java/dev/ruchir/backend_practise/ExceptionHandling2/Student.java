package dev.ruchir.backend_practise.ExceptionHandling2;

public class Student {
    public void handleDivisionByZero() {
        int a = 10;
        int b = 0; // This causes the division by zero error

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public void handleNullPointer() {
        String str = null; // This will cause a NullPointerException

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempt to access a null object.");
        }
    }

    public void handleArrayIndexOutOfBounds() {
        int[] array = {1, 2, 3};

        try {
            int number = array[5]; // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Number: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }

    public void handleNumberFormatException() {
        String numberStr = "abc"; // This will cause NumberFormatException

        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid format for converting string to number.");
        }
    }

}
