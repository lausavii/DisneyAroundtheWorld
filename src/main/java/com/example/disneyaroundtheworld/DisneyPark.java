
package com.example.disneyaroundtheworld;

public class DisneyPark {

    private String name;
    private String location;
    private String resort;
    private int numberOfParks;

    public DisneyPark(String name, String location, String resort, int numberOfParks) {
        this.name = name;
        this.location = location;
        this.resort = resort;
        this.numberOfParks = numberOfParks;
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

    public int getNumberOfParks() {
        return numberOfParks;
    }
}
