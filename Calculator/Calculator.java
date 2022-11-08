import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        System.out.println("Your number 1: ");
        float num1 = nums.nextFloat();
        System.out.println("Your number 2: ");
        float num2 = nums.nextFloat();
        System.out.println("Pick operation: (+, -, *, /, e, ^) ");
        char operation = nums.next().charAt(0);

        switch(operation){
            case '+':
               float sum =  num1 + num2;
               System.out.println("The sum of the operation at num1 and num2 is: " + sum);
               break;
            case '-':
                sum = num1 - num2;
                System.out.println("The sum of the operation at num1 and num2 is: " + sum);
                break;
            case '*':
                sum = num1 * num2;
                System.out.println("The sum of the operation at num1 and num2 is: " + sum);
                break;
            case '/':
                sum = num1 / num2;
                System.out.println("The sum of the operation at num1 and num2 is: " + sum);
                break;
            case 'e':
                while(num1 != num2){
                    if(num1 > num2){
                        num1 = num1-num2;
                    }else{
                        num2 = num2-num1;
                    }
                }
                System.out.println("The GCD of num1 and num2 is: " + num1);
                break;
            case '^':
                float sum1 = num1 * num1;
                System.out.println("Num1 to the power of itself is equal to: " + sum1);
                sum = num2 * num2;
                System.out.println("Num2 to the power of itself is equal to: " + sum); 
                break;
            default:
            System.out.println("Not a char");
            break;
        }
    }
    
}
