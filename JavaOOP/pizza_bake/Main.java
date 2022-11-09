package pizza_bake;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella");

        System.out.println("Here are your pizza ingredients: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
