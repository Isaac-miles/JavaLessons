public class WhileLoops {
    public static void main(String[] args) {

        int j = 5;
        while (j<=20){
            j++;
           if(!isEven(j)){
               continue;
           }
            System.out.println(j +" is even number "+ isEven(j));
            j++;
        }

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
