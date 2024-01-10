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

        //string inspection methods
        printInformation("Hello miles");
        printInformation("");
        printInformation("\t \n");
        String helloWorld = "Hello world";
        System.out.printf("index of r = %d %n",helloWorld.indexOf("r"));
        System.out.printf("index of world = %d %n",helloWorld.indexOf("world"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf("l"));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf("l"));

        System.out.printf("index of l = %d %n",helloWorld.indexOf("l",3));
        System.out.printf("index of l = %d %n",helloWorld.lastIndexOf("l",8));

        //string comparison methods
        String helloWorldLower = helloWorld.toLowerCase();

    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if(string.isEmpty()){
            System.out.println("string is empty ");
            return;
        }
        if(string.isBlank()){
            System.out.println("string is blank ");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}
