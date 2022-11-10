package super_keyword;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("batman", 42, "$$$");
        Hero hero2 = new Hero("superman", 43, "everything");

        System.out.println(hero2.toString());
        System.out.println(hero1.toString());
    }
}
