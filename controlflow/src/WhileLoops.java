public class WhileLoops {
    public static void main(String[] args) {

        int j = 5;
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
        }

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
