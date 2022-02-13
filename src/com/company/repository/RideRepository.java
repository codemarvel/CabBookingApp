package com.company.repository;

import com.company.models.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideRepository {
    private List<Ride> rideList;

    public RideRepository() {
        this.rideList = new ArrayList<>();
    }

    public List<Ride> getRideList() {
        return rideList;
    }

    public void setRideList(List<Ride> rideList) {
        this.rideList = rideList;
    }
    private void addRide(Ride ride)
    {
        this.rideList.add(ride);
    }
}
