package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.catalog.CatalogException;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            

            System.out.println("enter a whole number to divide: ");
            int x = scanner.nextInt();
            System.out.println("enter a whole numbr to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by 0 IDIOT");
        }catch(InputMismatchException e){
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }
        catch(Exception e){
            System.out.println("Something went wrong bruh");
        }
        finally{
            scanner.close();
        }

    }
}
