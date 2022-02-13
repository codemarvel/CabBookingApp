package com.company.models;

public class Driver {

    private String username;
    private  char gender;
    private  int age;
    private String vehicleDetails;
    private Boolean status;
    private Location location;
    private int totalEarning;
    public Driver(){}

    public Driver(String username, char gender, int age,String vehicleDetails,Boolean status, int x, int y,int totEarning) {
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.vehicleDetails =vehicleDetails;
        this.status=status;
        Location loc =new Location(x,y);
        this.location = loc;
        this.totalEarning = totEarning;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(int totalEarning) {
        this.totalEarning = totalEarning;
    }
}
