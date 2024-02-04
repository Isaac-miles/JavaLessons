package dev.zico;

public class Main {
    public static void main(String[] args) {
        BaseBallTeam lakers = new BaseBallTeam("Lakers");
        BaseBallTeam olandos = new BaseBallTeam("Olandos");
        scoreResult(lakers,5,olandos,4);
    }
    public static void scoreResult(BaseBallTeam team1, int t1_score,
                                   BaseBallTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1,message,team2);
    }
}

record BaseBallPlayer(String name, String position){}