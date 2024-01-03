import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter val");
        int val = scanner.nextInt();
        switch (val) {
            case 1 -> System.out.println("val was one");
            case 2 -> System.out.println("val was two");
            default -> System.out.println("was not one or two");
        }
        String month = scanner.next();
        System.out.println(month +" is in the "+getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month){
        switch (month){
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        }
        return "Bad";
    }
}