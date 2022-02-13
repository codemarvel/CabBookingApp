package com.company.models;

public class Ride {
    private String passenger;
    private String driver;
    private boolean isStarted;
    private boolean isCompleted;
    private float rideAmount;
    private Location source;
    private Location destination;


    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public float getRideAmount() {
        return rideAmount;
    }

    public void setRideAmount(float rideAmount) {
        this.rideAmount = rideAmount;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }
}
