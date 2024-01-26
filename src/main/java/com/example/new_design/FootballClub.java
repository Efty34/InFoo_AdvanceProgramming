package com.example.new_design;

public class FootballClub {
    private int index;

    private String name;
    private String code;
    private String country;

    public FootballClub(int index,String name, String code, String country) {
        this.index=index;
        this.name = name;
        this.code = code;
        this.country = country;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

}
