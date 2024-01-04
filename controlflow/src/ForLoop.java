public class ForLoop {
    public static void main(String[] args) {
//        for(double rate=7.5; rate<=10.0; rate+=0.25){
//            if(rate >9.0) break;
//            System.out.println(calculateInterest(100, rate));
//        }
//        for(double rate = 1.0; rate<=5.0; rate++){
//            System.out.println(calculateInterest(10000.0, rate));
//        }
        challenge(50);


    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }
        for(int divisor=2; divisor <= wholeNumber/2;divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }

        }
        return  true;
    }
    public static int challenge(int number){
        int count =0;
        for(int i=0; i<number;i++){
            if(count ==3) break;

            if(isPrime(i)){
                count++;
                System.out.println(i + "is a prime number");
            }
        }
        System.out.println("total prime numbers found is "+ count);

        return count;
    }
}
