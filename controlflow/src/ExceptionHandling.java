public class ExceptionHandling {
    public static void main(String[] args) {

        // reading inputs
        int currentYear = 2024;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what's your name ?");
        System.out.println("Hi "+ name);
        return "";
    }
    public static String getInputFromScanner(int currentYear){
        return "";
    }
}
