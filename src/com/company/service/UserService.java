package com.company.service;

import com.company.models.Location;
import com.company.models.User;

import java.util.List;

public class UserService {

    public void add_user(String username, char gender, int age, List<User> userList) {

        User user =new User();
        try {
            user.setUsername(username);
            user.setAge(age);
            user.setGender(gender);
            userList.add(user);
        }
        catch(Exception e)
        {System.out.println("Enter values properly " + e.getMessage());}
    }
    public void update_user(String username, char gender, int age, List<User> userList)
    {
        try {
            for (User user : userList) {
                if (user.getUsername() == username) {
                    user.setGender(gender);
                    user.setAge(age);
                }
            }
        }
        catch(Exception e)
        {System.out.println("Enter values properly " + e.getMessage());}
    }
    public void update_user_location(String username, int x,int y, List<User> userList)
    {
        for(User user: userList)
        {
            if(user.getUsername()==username)
            {
                Location location = new Location();
                location.setY(y);
                location.setX(x);
                user.setLocation(location);
            }
        }
    }
}
