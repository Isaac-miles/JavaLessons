package dev.zico;

public class Main {
    public static void main(String[] args) {
        BaseBallTeam lakers1 = new BaseBallTeam("Lakers");
        BaseBallTeam olandos1 = new BaseBallTeam("Olandos");
        scoreResult(lakers1,5,olandos1,4);

        BaseBallTeam lakers2 = new BaseBallTeam("Lakers");
        BaseBallTeam olandos2 = new BaseBallTeam("Olandos");
        scoreResult(lakers2,5,olandos2,4);


        GenericTeam<BaseBallPlayer> lakers = new GenericTeam<>("Lakers");
        GenericTeam<BaseBallPlayer> olandos = new GenericTeam<>("Olandos");
//        scoreResult(lakers,5,olandos,4);

        lakers.addTeamMember(new BaseBallPlayer("Kobi","Attacker"));
        olandos.addTeamMember(new BaseBallPlayer("Mosh", "defender"));

        var ronald = new BaseBallPlayer("ronald","GK");
        lakers.addTeamMember(ronald); //No type checking as it allowed us to add both base and football player
        olandos.listTeamMembers();
        olandos.listTeamMembers();

        SportTeam afa1 = new SportTeam("Ajaokuata");
        GenericTeam<FootballPlayer> afa = new GenericTeam<>("Ajaokuata");

        var baron = new FootballPlayer("Baron","CDM");
        afa.addTeamMember(baron);
        var simeon = new FootballPlayer("Simeon Ochani","Attacker");
        afa.addTeamMember(simeon);
        afa.listTeamMembers();

        var coldStone = new GenericTeam<VollyBallPlayer>("Cold Stone");
        coldStone.addTeamMember(new VollyBallPlayer("Isaac", "CM"));
        coldStone.listTeamMembers();
        scoreResult(coldStone,1,coldStone,2);

        //generics can't be used with primitive types
//        GenericTeam<int> miles = new GenericTeam<int>("Miles"); this doesn't compile
        //luckily autoboxing comes into play

//        GenericTeam<Integer> miles = new GenericTeam<>("Miles Integer");


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
record VollyBallPlayer(String name, String position) implements Player{}