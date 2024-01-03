import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter val");
        int val = scanner.nextInt();
        switch (val){
            case 1:
                System.out.println("val was one");
                break;
            case 2:
                System.out.println("val was two");
                break;
            default:
                System.out.println("was not one or two");
                break;
        }
    }
}