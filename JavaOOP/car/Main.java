package car;

public class Main {
    public static void main(String[] args) {
        //Food[] refrigeretor = new Food[3]; 

        Food food1 = new Food("pizza");
        Food food2 = new Food("hotto dogu");
        Food food3 = new Food("burger");
        
        Food[] refrigeretor = {food1, food2, food3};

        System.out.println(refrigeretor[0].name);
        System.out.println(refrigeretor[1].name);
        System.out.println(refrigeretor[2].name);
    }
}
