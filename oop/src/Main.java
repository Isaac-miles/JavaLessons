
public class Main {
    public static void main(String[] args) {
        //for account
//    Account account = new Account("6560600", 1000.0,"miles", "miles@gmail.com","070500");
//        Account accountA = new Account();
//        System.out.println(account.getBalance());
//    account.depositFunds(200.0);
//    account.withdrawFunds(67.0);
//    account.depositFunds(89);
//    Account accountB = new Account("Tim","tim@gmail", "4923");


        //for Pojo
//        for (int i = 1; i < 5 ; i++) {
//            POStudents miles = new POStudents(
//                    "csc01"+i,
//                    switch (i){
//                        case 1 ->"josi";
//                        case 2 ->"helen";
//                        case 3 ->"john";
//                        case 4 -> "joy";
//                        default -> "Anonymous";
//                    },
//                    "15-01-2010",
//                    "Python class");
//            System.out.println(miles);
//        }
//        PojoStudent pojoStudent =  new PojoStudent("csc2014", "Agnes","05-10-2005", "java masterclass");
//        POStudents recordStudent = new POStudents("csc2013", "Alao","05-10-2000", "java masterclass");
//
//        System.out.println(recordStudent);
//        System.out.println(pojoStudent);
//
//        pojoStudent.setClassList(pojoStudent.getClassList()+ " Java OOP Exam 201");
//
//        System.out.println(pojoStudent.getName() + " is taken " + pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taken " + recordStudent.classList());

        //for Inheritance
        AnimalInheritance animal = new AnimalInheritance("cow", "light", 200);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("german",  50);
        doAnimalStuff(dog, "10km");

        Dog retriever = new Dog("golden retriever",79,"curly", "bent");
        doAnimalStuff(retriever, "10km");
    }
    public static void doAnimalStuff(AnimalInheritance animal, String speed){
        animal.makeNoise();
        animal.move("30km");
        System.out.println(animal);
        System.out.println("____--------");
    }
}