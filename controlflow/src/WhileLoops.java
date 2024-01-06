public class WhileLoops {
    public static void main(String[] args) {

        int j = 4;
        int evenCount =0;
        int oddCount = 0;
        while (j<=20){
            j++;
           if(!isEven(j)){
               oddCount++;
               continue;
           }
            System.out.println(j +" is even number ");
           evenCount++;
           if(evenCount >= 5) break;
        }
        System.out.println("Total odd numbers "+ oddCount);
        System.out.println("Total even numbers " + evenCount);

        System.out.println("The sum of the digits in number is "+ sumDigitChallenge(1234));

        // reading inputs
        int currentYear = 2024;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }


    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int sumDigitChallenge(int number){
        if(number<0)return -1;

        int sum = 0;
        while(number>9){
            sum += (number%10);
            number = number/10;
        }
        sum+=number;
        return sum;

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what's your name ?");
        System.out.println("Hi "+ name);
        return "";
    }
    public static String getInputFromScanner(int currentYear){
        return "";
    }
}
