import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // reading inputs
        int currentYear = 2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
              System.out.println(getInputFromScanner(currentYear));
        }

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what's your name ?");
        System.out.println("Hi "+ name);
        return "";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born ?");
        int year = scanner.nextInt();
        return ("you are " + (currentYear - year)+" years old");
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;
        if((dob < minYear) || (dob>minYear)){
            return -1;
        }
        return  (currentYear - dob);
    }
}
