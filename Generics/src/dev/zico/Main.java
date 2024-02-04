package dev.zico;

public class Main {
    public static void main(String[] args) {
        BaseBallTeam lakers = new BaseBallTeam("Lakers");
        BaseBallTeam olandos = new BaseBallTeam("Olandos");
    }
}

record BaseBallPlayer(String name, String position){}