public class InheritanceChalleng {
    public static void main(String[] args) {
    Worker work = new Worker("miles","12-02-2010","15-11-2019");
        System.out.println(work);
    }
}

class Worker{
    private String name;
    private String dob;
    private String endDate;

    public Worker(String name, String dob, String endDate) {
        this.name = name;
        this.dob = dob;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    public Employee(String name, String endDate, Long employeeId, String hireDate) {
        super(name, "2-2-200", endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}