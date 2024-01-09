import java.awt.*;

public class StringFormatting {
    public static void main(String[] args) {
        //insert a tab character \t
        //insert a new line \n
        //insert a double quote character \"
        //insert a backslash character

        String bulletIt = "Print a bulleted list:\n"+"\t• first point"+"\t\t• Sub Point ";
        System.out.println(bulletIt);
        //using text block
        String textblock = """
                Print a Bulleted List:
                • First point
                 • Sub point
                """;
        System.out.println(textblock);
    }
}
