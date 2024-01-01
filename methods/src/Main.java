import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        calculateMortgage();
        System.out.println(calculateMortgage());
    }

    public static String calculateMortgage(){
        final byte numMonths = 12;
        final byte percent = 100;
        int principal;   float interestRate; byte  years;
        float monthlyPayment; int numberOfPayment;
        Scanner scanner =  new Scanner(System.in);

        while (true){
            System.out.print("Enter Principal Amount\t");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.println("Enter a valid amount");
        }
        while (true){
            System.out.print("Enter annual interest rate\t");
            interestRate = scanner.nextFloat();
            if(interestRate >=1 && interestRate <= 30){
                monthlyPayment = (interestRate/percent/numMonths );
                break;
            }
            System.out.println("Enter valid rate between 1 and 30");
        }
        while (true){
            System.out.print("Enter the number of Years\t");
            years = scanner.nextByte();
            if(years >=1 && years <= 30 ){
                numberOfPayment = years * 12;
                break;
            }
            System.out.println("Invalid number of years");

        }

        double mortgage = principal *(monthlyPayment * Math.pow(1 + monthlyPayment, numberOfPayment))
                /(Math.pow(1+monthlyPayment, numberOfPayment));
        return NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Your Mortgage is\t" + formattedMortgage);

    }
}