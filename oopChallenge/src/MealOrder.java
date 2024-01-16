public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;
    public MealOrder(){
        this("regular","coke", "fires");
    }
    public MealOrder(String burgerType, String drinkType,String sideType){
        this.burger = new Burger(burgerType,4.0);
        this.drink = new Item("drink",drinkType,1.0);
        this.side = new Item("side",sideType,1.50);
    }
}
