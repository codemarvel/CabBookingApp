package com.company.service;

import com.company.models.Driver;
import com.company.models.Location;
import com.company.models.Ride;
import com.company.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.*;

public class RideService {



    public List<String> find_ride(String username, int sx, int sy, int dx, int dy, List<User> userList, List<Driver> driverList) {
        List<String> availableDrivers = new ArrayList<>();
        for (Driver driver : driverList) {
            Location loc = driver.getLocation();

            double distance = sqrt(pow(sx - loc.getX(), 2) + pow(sy - loc.getY(), 2));
            if (distance <= 5 && driver.getStatus()) {
                availableDrivers.add(driver.getUsername());
                System.out.println(driver.getUsername()+"[Available]");
            }

        }
        if (availableDrivers.isEmpty()) {
            System.out.println("No ride found ");
        }
        return availableDrivers;
    }

    public String choose_ride(String userName, String driverName, List<Ride> rideList, HashMap<String, Location[]> rideQueries) {
        for (var entry : rideQueries.entrySet()) {
            try {
                if (entry.getKey() == userName) {
                    Ride ride = new Ride();
                    ride.setDriver(driverName);
                    ride.setPassenger(userName);
                    ride.setStarted(true);
                    ride.setCompleted(false);
                    ride.setSource(entry.getValue()[0]);
                    ride.setDestination(entry.getValue()[1]);
                    ride.setRideAmount(0);
                    rideList.add(ride);
                    System.out.println("Your ride has started");
                    return "Your ride has started";
                }
            }
            catch (Exception e)
            { System.out.println("Some error occured "+e.getMessage());}

        }
        System.out.println("No User found");
    return "No User found";
    }
    public void  calculateBill(String userName,List<Ride> rideList,List<User> userList,List<Driver> driverList)
    {
        for(Ride  ride : rideList)
        {
            if(ride.getPassenger()==userName)
            {
                ride.setCompleted(true);
                Location l1 = ride.getDestination();
                Location l2 = ride.getSource();
                int amount = abs(l1.getX()-l2.getX())+abs(l1.getY()- l2.getY())-2 ;
                ride.setRideAmount(amount);
                UserService userService = new UserService();
                DriverService driverService = new DriverService();
                userService.update_user_location(userName,l1.getX(),l1.getY(),userList);
                driverService.update_driver_location(ride.getDriver(),l1.getX(),l1.getY(),driverList);
                driverService.add_earning(ride.getDriver(),amount,driverList);
                System.out.println("Ride ended , Bill amount is $" + Integer.toString(amount));
                return;
//                return ("Ride ended , Bill amount is $" + Integer.toString(amount));

            }
        }
        System.out.println("No ride found");

    }

}
