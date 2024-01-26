package com.example.new_design;

public class DataInfo {
    private int index;
    private String round;
    private String date;
    private String team1;
    private String team2;
    private int team1score;
    private int team2score;

    public DataInfo(int index, String round, String date, String team1, String team2, int team1score, int team2score) {
        this.index=index;
        this.round = round;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.team1score=team1score;
        this.team2score=team2score;
    }

    public int getIndex() {
        return index;
    }

    public String getRound() {
        return round;
    }

    public String getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getTeam1score() {
        return team1score;
    }

    public int getTeam2score() {
        return team2score;
    }
}
