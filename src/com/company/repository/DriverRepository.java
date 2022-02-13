package com.company.repository;

import com.company.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepository {

    List<Driver> driverList;

    public DriverRepository() {
        this.driverList = new ArrayList<>();
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }
    public void addDriver(Driver driver)
    {
        this.driverList.add(driver);
    }


}
