import java.util.*;

class userInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("num1 is grater than num2");
        }else{
            System.out.println("num2 is grater than num1");
        }

        while(a != b){
            if(a>b){
                a = a-b;
                System.out.println("Iteration num1 val= " + a);
            }else{
                b = b-a; 
                System.out.println("Iteration num2 val= " +b);
            }
        }
        System.out.println("The GCD of num1 and num2 is: " + a);
    }
}
