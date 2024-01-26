package com.example.new_design;

public class TableForClub {

    private int  id;
    private String  team;
    private int wins;
    private int draws;
    private int losses;
    private int played;
    private int points;
    private int goalsFor;
    private int goalsAgainst;
    private String goalDifference;

    public TableForClub(int id, String team, int wins, int draws, int losses, int played, int points, int goalsFor, int goalsAgainst, String goalDifference) {
        this.id = id;
        this.team = team;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.played = played;
        this.points = points;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public int getPlayed() {
        return played;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public String getGoalDifference() {
        return goalDifference;
    }

}
