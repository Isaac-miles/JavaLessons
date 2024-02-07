package dev.zico.burger;

public class Store {
    public static void main(String[] args) {
        Meal meal = new Meal();
        System.out.println(meal);

        Meal NGRegularMeal = new Meal(1_450);
        System.out.println(NGRegularMeal);
    }
}
