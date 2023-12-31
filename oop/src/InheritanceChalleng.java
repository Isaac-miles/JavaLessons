public class InheritanceChalleng {
    public static void main(String[] args) {
    Employee miles = new Employee("miles", "10-10-1996","10-11-2021");
        System.out.println(miles.getAge());
        System.out.println(miles);

        SalariedEmployee joe = new SalariedEmployee("joe","23-06-2022", "12-02-2010",35000);
        System.out.println(joe);
        System.out.println("joe's $ = " + joe.collectPay());
        joe.retired();
        System.out.println("Joe's pension check = $ "+ joe.collectPay());
        HourlyEmployee joy = new HourlyEmployee("Joy","09-07-2000","10-03-2024",15.0);
        System.out.println(joy);
        System.out.println("joy's paycheck = $  "+joy.collectPay());
        System.out.println("joy's holiday = $  "+joy.getDoublePay());

    }


}

class Worker{
    protected String name;
    private String dob;
    protected String endDate;

    public Worker(){}
    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
    public int getAge(){
        int currentYear = 2024;
        int birthYear = Integer.parseInt(dob.substring(6));
        return currentYear - birthYear;
    }
    public double collectPay(){
        return 10.0;
    }
    public void terminate(String endDate){
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
    private static int employeeNo = 1;
    public Employee(String name, String dob, String hireDate) {
        super(name, dob);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String dob, String hireDate, double annualSalary) {
        super(name, dob, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retired(){
     terminate("09-01-2024");
     isRetired = true;
    }
    @Override
    public double collectPay(){
        double paycheck = annualSalary /26;
        return isRetired? 0.9 * paycheck : paycheck;
    }

}

class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String dob, String hireDate, double hourlyPayRate) {
        super(name, dob, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    @Override
    public double collectPay(){
        return 40*hourlyPayRate;
    }
    public double getDoublePay(){
        return 2* collectPay();
    }
}