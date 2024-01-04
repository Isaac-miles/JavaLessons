public class ForLoop {
    public static void main(String[] args) {
        for(int i= 0; i<=3; i++){
            System.out.println(i);
        }
        System.out.println(calculateInterest(1000, 3.5));
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }
}
