package com.company.service;

import com.company.models.Driver;
import com.company.models.Location;

import java.util.List;

public class DriverService {

    public void add_driver(String userName, char gender, int age , String vehicleDetails , int x , int y, List<Driver> driverList)
    {
        try {
            Driver driver = new Driver(userName, gender, age, vehicleDetails, true, x, y, 0);

            driverList.add(driver);
        }
        catch(Exception e)
        {
            System.out.println("values are not properly added");
        }

    }
    public void update_driver_location(String username, int x,int y, List<Driver> driverList)
    {
        for(Driver driver: driverList)
        {
            if(driver.getUsername()==username)
            {
                Location location = new Location();
                location.setY(y);
                location.setX(x);
                driver.setLocation(location);
            }
        }
    }
    public void change_driver_status(String username, Boolean status, List<Driver> driverList)
    {
        for(Driver driver: driverList)
        {
            if(driver.getUsername()==username)
            {
                driver.setStatus(status);
            }
        }
    }

    public void add_earning(String driverName, int amount, List<Driver> driverList) {
        for(Driver driver: driverList)
        {
            if(driver.getUsername()==driverName)
            {   int amt= amount + driver.getTotalEarning();
                driver.setTotalEarning(amt);
            }
        }
    }
    public void find_total_earning(List<Driver>driverList)
    {
        for(Driver driver: driverList)
        {
            System.out.println(driver.getUsername()+ " earns $" + driver.getTotalEarning());
        }
    }
}
