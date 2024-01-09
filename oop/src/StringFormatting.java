import java.util.Arrays;

public class StringFormatting {
    public static void main(String[] args) {
        //insert a tab character \t
        //insert a new line \n
        //insert a double quote character \"
        //insert a backslash character

        String bulletIt = "Print a bulleted list:\n"+"\t• first point"+"\t\t• Sub Point ";
        System.out.println(bulletIt);
        //using text block
        String textBlock = """
                Print a Bulleted List:
                • First point
                 • Sub point
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("your age is %d%n", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("your age is %.2f%n", (float)age);

        for(int i = 1; i<=10000; i*=10){
            System.out.printf("Printing %6d %n", i);
        }
        //string also has the above capability
        String formattedString = String.format("your age is %d", age);
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
