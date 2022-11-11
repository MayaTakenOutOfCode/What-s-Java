package dynamic_polimorphism;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal?");
        System.out.println("(1=Dog) or (2=Cat): ");
        int choice = scanner.nextInt();


        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
