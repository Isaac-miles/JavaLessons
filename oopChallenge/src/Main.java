// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Item coke = new Item("drink", "coke",1.6);
     coke.printItem();
     coke.setSize("LARGE");
     coke.printItem();

     Item avocado = new Item("TOPPING", "avocado",1.4);
     avocado.printItem();

    }
}