public class WhileLoops {
    public static void main(String[] args) {

        int j = 5;
        while (j<=20){
            isEven(j);
            j++;
        }

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
