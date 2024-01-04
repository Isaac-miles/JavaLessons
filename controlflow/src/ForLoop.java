public class ForLoop {
    public static void main(String[] args) {
//        for(double rate=7.5; rate<=10.0; rate+=0.25){
//            if(rate >9.0) break;
//            System.out.println(calculateInterest(100, rate));
//        }
//        for(double rate = 1.0; rate<=5.0; rate++){
//            System.out.println(calculateInterest(10000.0, rate));
//        }

        System.out.println("1 is "+ (isPrime(1)? "": "Not") +"a prime number");
        System.out.println("2 is "+ (isPrime(2)? "": "Not") +"a prime number");
        System.out.println("8 is "+ (isPrime(8)? "": "Not") +"a prime number");

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }
        return  true;
    }
}
