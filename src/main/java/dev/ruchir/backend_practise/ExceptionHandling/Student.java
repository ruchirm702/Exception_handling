package dev.ruchir.backend_practise.ExceptionHandling;

import java.sql.SQLException;

public class Student {
    static int dosomething(int x) throws Exception {
        // Runtime exception: unchecked exception --> no need to mention
        if (x == 0) {
            throw new ArithmeticException();
        }
        // Exception: checked exception --> need to mention
        else if (x == 1) {
            throw new ClassNotFoundException();
        }
        // Exception: checked exception --> need to mention
        else if (x == 2) {
            throw new SQLException();
        }
        // Runtime exception: unchecked exception --> no need to mention
        else if (x == 3) {
            throw new NumberFormatException();
        }
        // Assuming RandomException is a custom exception that needs to be defined
        else if (x == 4) {
            throw new RandomException();
        }
        else if(x == 5){
            throw new IllegalAccessException();
        }
        return 0;  // Default return value for other cases
    }
}
