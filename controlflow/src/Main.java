import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        String month = scanner.next();
//        System.out.println(month +" is in the "+getQuarter(month) + " quarter");
        printDayOfWeek(5);
    }
    public static String getQuarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
               yield (month + " is not a valid month");
            }
        };
    }

    public static void printDayOfWeek(int day){
        String dayOfTheWeek = switch (day){
            case 0 -> "Sunday";
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(dayOfTheWeek);
    }
}