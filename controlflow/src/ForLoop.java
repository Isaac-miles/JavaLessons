public class ForLoop {
    public static void main(String[] args) {
        for(int i= 0; i<=3; i++){
            System.out.println(i);
        }
        for(double rate = 1.0; rate<=5.0; rate++){
            System.out.println(calculateInterest(10000.0, rate));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }
}
