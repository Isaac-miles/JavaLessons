public class MethodOverload {
    public static  void main(String[] args){
    int newScore = calculateScore("miles", 100);
        System.out.println(newScore);

        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player"+playerName+"scored"+score+"points");
        return score*1000;
    }
    public static int calculateScore(int score){
        System.out.println("Player scored"+score+"points");
        return score;
    }
    public static int calculateScore(){
        System.out.println("No player scored anything");
        return 0;
    }
}
