package dev.ruchir.backend_practise.ExceptionHandling;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args)throws Exception{
        try{
            Student.dosomething(4);
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }catch(SQLException e){
            System.out.println("SQL Exception");

        }catch(RandomException e){
            System.out.println("Random Exception");

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }


    }
}
