import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName+" "+lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Miles","Davies"),
                new Main.Person("Davies","Isaac"),
                new Person("Helen", "Bright"),
                new Person("Charlie", "Brown")
                ));
        //using anonymous class

    }
}