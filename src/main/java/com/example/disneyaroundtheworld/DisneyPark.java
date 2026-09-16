package com.example.disneyaroundtheworld;

public class DisneyPark {

    private String name;
    private String location;
    private String resort;

    public DisneyPark(String name, String location, String resort) {
        this.name = name;
        this.location = location;
        this.resort = resort;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getResort() {
        return resort;
    }
}