package com.company.Driver;

import com.company.models.Location;
import com.company.repository.DriverRepository;
import com.company.repository.RideRepository;
import com.company.repository.UserRepository;
import com.company.service.DriverService;
import com.company.service.RideService;
import com.company.service.UserService;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        UserRepository userRepository = new UserRepository();
        DriverRepository driverRepository = new DriverRepository();
        RideRepository rideRepository = new RideRepository();

        UserService userService = new UserService();
        DriverService driverService = new DriverService();
        RideService rideService = new RideService();

        //Calling Test Functions
        userService.add_user("Abhishek",'M',23,userRepository.getUserList());
        userService.update_user_location("Abhishek",0,0,userRepository.getUserList());

        userService.add_user("Rahul",'M',29,userRepository.getUserList());
        userService.update_user_location("Rahul",10,0,userRepository.getUserList());

        userService.add_user("Nandini",'M',22,userRepository.getUserList());
        userService.update_user_location("Nandini",15,6,userRepository.getUserList());

        driverService.add_driver("Driver1", 'M', 22,"Swift, KA-01-12345”",10,1,driverRepository.getDriverList());
        driverService.add_driver("Driver2", 'M', 29,"Swift, KA-01-12345",11,10,driverRepository.getDriverList());
        driverService.add_driver("Driver3", 'M', 24,"Swift, KA-01-12345",5,3,driverRepository.getDriverList());


        HashMap<String, Location[]> rideQueries = new HashMap<>();
         Location[] loc = new Location[2];
         loc[0]=new Location(0,0);
         loc[1]=new Location (20,1);
         rideQueries.put("Abhishek",loc );

        rideService.find_ride("Abhishek" , 0,0,20,1,userRepository.getUserList(),driverRepository.getDriverList());

        loc[0]=new Location(10,0);
        loc[1]=new Location (15,3);
        rideQueries.put("Rahul",loc );

        rideService.find_ride("Rahul" , 10,0,15,3,userRepository.getUserList(),driverRepository.getDriverList());

        rideService.choose_ride("Rahul","Driver1", rideRepository.getRideList(), rideQueries);

        rideService.calculateBill("Rahul",rideRepository.getRideList(),userRepository.getUserList(),driverRepository.getDriverList());

        driverService.change_driver_status("Driver1",false,driverRepository.getDriverList());

        loc[0]=new Location(15,6);
        loc[1]=new Location (20,4);

        rideService.find_ride("Nandini" , 15,6,20,4,userRepository.getUserList(),driverRepository.getDriverList());

        driverService.find_total_earning(driverRepository.getDriverList());

    }
}
