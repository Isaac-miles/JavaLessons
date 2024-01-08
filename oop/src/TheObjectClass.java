public class TheObjectClass extends Object{
    public static void main(String[] args) {
    Student Isaac = new Student("Isaac", 27);
        System.out.println(Isaac);
        PrimarySchoolStudent josiah = new PrimarySchoolStudent("Josiah", 8, "Joy");
        System.out.println(josiah);
    }

}

class Student {
 private  String name;
 private int age;
    Student(String name , int age){
     this.age = age;
     this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class PrimarySchoolStudent extends Student{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s child "+ super.toString();
    }
}