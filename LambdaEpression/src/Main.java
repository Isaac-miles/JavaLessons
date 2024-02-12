import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        var comparatorLastname = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.firstName);
            }
        };
    }
}