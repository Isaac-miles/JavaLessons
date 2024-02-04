package dev.zico;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {
    private String teamName;
    private List<BaseBallPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseBallTeam(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamMember(BaseBallPlayer player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }
}
