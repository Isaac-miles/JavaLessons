// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//     Item coke = new Item("drink", "coke",1.6);
//     coke.printItem();
//     coke.setSize("LARGE");
//     coke.printItem();
//
//     Item avocado = new Item("TOPPING", "avocado",1.4);
//     avocado.printItem();

//        Burger burger = new Burger("regular", 4.0);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","HAM");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "sprite","chips");
//        secondMeal.addBurgerToppings("ugwu","HAM","CHEESE");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","fanta","nuts");
        deluxeMeal.addBurgerToppings("AVOCADO","CHEESE","LEAF","MAYO","LETTUCE");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}