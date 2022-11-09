//import javax.swing.JOptionPane;
import java.util.*;

public class Main{
    public static void main(String[] args){

       /*   String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm high!"); 
                        
        /*nested loop:

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol  = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j =1; j<=columns;j++){
                System.out.print(symbol);
            }
        }
        //Arrays:  
        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado"; 

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "Tesla"; 

        cars[2][0] = "BMW";
        cars[2][1] = "Ferrari";
        cars[2][2] = "Lambo"; 

        for(int i = 0; i<cars.length; i++){
            System.out.println();
            for(int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
        */
        //String name = "    Maya    ";
        //boolean result = name.equalsIgnoreCase("maya");
        //char result = name.charAt(0);
        //int result = name.indexOf("a");
        //boolean result = name.isEmpty();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('a', 'o');
        //System.out.println(result);

       /* Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Maya";
        */

        /*Array list:

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Jelly");

        food.set(0, "Sushi");
        food.remove(2);
        food.clear();

        for(int i = 0; i<food.size(); i++) {
            System.out.println(food.get(i));
        } */

        //2D Array Lists:

        /*
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("Pasta");
        bakeryList.add("Garlic bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<String>();

        produceList.add("Tomato");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<String>();

        drinksList.add("Water");
        drinksList.add("Soda");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(1));
        */

        //foreach array: 
        //String[] animals = {"cat", "dog", "rat", "bird"};
        /*ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird"); 

        for(String i : animals){
            System.out.println(i);
        }*/
        
        //Overloaded Methods:

        //double x = add(1.0,2.0,3.0, 4.0);
        //System.out.println(x);

        //printf():
        
        /* 
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Maya";
        int myInt = 50;
        double myDouble = 1000;
        */
        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c", myChar);
        //System.out.printf("%s", myString);
        //System.out.printf("%d", myInt);
        //System.out.printf("%f", myDouble);

        //[width]
        //System.out.printf("Hello %-10s", myString);
    
        //System.out.printf("You have this much money %.2f", myDouble);

        //final keyword:
        //final double PI = 3.14159;

        //System.out.println(PI);

        //OOP:
        DiceRoller diceRoller = new DiceRoller();
    }
    /*
    static int add(int a, int b){
        System.out.println("This is oerloaded method 1");
        return a+b;
    }  
    static int add(int a, int b, int c){
        System.out.println("This is oerloaded method 2");
        return a+b+c;
    }  
    static int add(int a, int b, int c, int d){
        System.out.println("This is oerloaded method 3");
        return a+b+c+d;
    }  
    static double add(double a, double b){
        System.out.println("This is oerloaded method 4");
        return a+b;
    }  
    static double add(double a, double b, double c){
        System.out.println("This is oerloaded method 5");
        return a+b+c;
    }  
    static double add(double a, double b, double c, double d){
        System.out.println("This is oerloaded method 6");
        return a+b+c+d;
    } */
}