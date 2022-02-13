package com.company.repository;

import com.company.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> userList;

    public UserRepository() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user)
    {
        this.userList.add(user);
    }
    public void updateUser(String username,User updatedUser)
    {
        for( User user : this.userList )
        {
            if(user.getUsername()==username)
            {
                try {
                    user.setUsername(updatedUser.getUsername());
                    user.setGender(updatedUser.getGender());
                    user.setAge(updatedUser.getAge());
                    user.setLocation(updatedUser.getLocation());
                }
                catch(Exception e)
                {

                }
            }
        }
    }
//    public void updateUserLocation(String username,int x,int y )
//    {
//        for( User user : this.userList )
//        {
//            if(user.getUsername()==username)
//            {
//                try {
//                   Location loc = new Location();
//                   loc.setX(x);
//                   loc.setY(y);
//                   user.setLocation(loc);
//                }
//                catch(Exception e)
//                {
//                    System.out.println("some error occurred");
//                }
//            }
//        }
//
//    }
}
