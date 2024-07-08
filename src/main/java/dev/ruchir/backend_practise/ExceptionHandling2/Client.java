package dev.ruchir.backend_practise.ExceptionHandling2;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Handling Division by Zero:");
        student.handleDivisionByZero();

        System.out.println("\nHandling Null Pointer Exception:");
        student.handleNullPointer();

        System.out.println("\nHandling Array Index Out of Bounds Exception:");
        student.handleArrayIndexOutOfBounds();

        System.out.println("\nHandling Number Format Exception:");
        student.handleNumberFormatException();
    }

}
