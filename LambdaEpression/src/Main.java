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
                new Person("Sally","Brown"),
                new Main.Person("Peppermint","Patty"),
                new Person("Lucy", "Van Pelt"),
                new Person("Charlie", "Brown"),
                new Person("Linus","Van Pelt")
                ));
        //using anonymous class
        var comparatorLastname = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.firstName);
            }
        };

        people.sort(comparatorLastname);
        System.out.println(people);

    }
}