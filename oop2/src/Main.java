// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("200", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inches HD", "Dell",27, "2010 X 1140");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus",4,6,"v6");

        PersonalComputer thePC = new PersonalComputer("200","Dell",theCase,theMonitor,theMotherBoard);
    }
}