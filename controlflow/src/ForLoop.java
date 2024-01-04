public class ForLoop {
    public static void main(String[] args) {
//        for(double rate=7.5; rate<=10.0; rate+=0.25){
//            if(rate >9.0) break;
//            System.out.println(calculateInterest(100, rate));
//        }
//        for(double rate = 1.0; rate<=5.0; rate++){
//            System.out.println(calculateInterest(10000.0, rate));
//        }
//        challenge(50);
        challenge(1000.0);

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
        for(int i=10; i<=number; i++){
            if(count ==3) break;

            if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number");
            }
        }
        System.out.println("total prime numbers found is "+ count);

        return count;
    }

    public static void challenge(double number){
        double count=0;
        double sumOfAll=0;

        for(double i = 1; i<=number; i++){
            if(i%3==0 && i%5==0){
                if(count >=5)break;
                sumOfAll +=i;
                count++;
                System.out.println(i+" that can be divided by 3 and 5");
            }
        }
        System.out.println("Sum of the numbers "+ sumOfAll);
    }
}
