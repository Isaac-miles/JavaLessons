public class PersonalComputer extends CompositionProduct{
 private ComputerCase computerCase;
 private Monitor monitor;
 private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
}
