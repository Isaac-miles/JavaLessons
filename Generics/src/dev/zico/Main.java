package dev.zico;

public class Main {
    public static void main(String[] args) {
        BaseBallTeam lakers1 = new BaseBallTeam("Lakers");
        BaseBallTeam olandos1 = new BaseBallTeam("Olandos");
        scoreResult(lakers1,5,olandos1,4);

        BaseBallTeam lakers2 = new BaseBallTeam("Lakers");
        BaseBallTeam olandos2 = new BaseBallTeam("Olandos");
        scoreResult(lakers2,5,olandos2,4);


        GenericTeam lakers = new GenericTeam("Lakers");
        GenericTeam olandos = new GenericTeam("Olandos");
//        scoreResult(lakers,5,olandos,4);

        lakers.addTeamMember(new BaseBallPlayer("Kobi","Attacker"));
        olandos.addTeamMember(new BaseBallPlayer("Mosh", "defender"));
        olandos.listTeamMembers();

        SportTeam afa = new SportTeam("Ajaokuata");
        var baron = new FootballPlayer("Baron","CDM");
        afa.addTeamMember(baron);

        var ronald = new BaseBallPlayer("ronald","GK");
        afa.addTeamMember(ronald); //No type checking as it allowed us to add both base and football player
        afa.listTeamMembers();

    }
    public static void scoreResult(BaseBallTeam team1, int t1_score,
                                   BaseBallTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1,message,team2);
    }
    public static void scoreResult(SportTeam team1, int t1_score,
                                   SportTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1,message,team2);

    }
    public static void scoreResult(GenericTeam team1, int t1_score,
                                   GenericTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n", team1,message,team2);

    }
}

record BaseBallPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
