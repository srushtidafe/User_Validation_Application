package com.example.UserValidation.Repository;
import com.example.UserValidation.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
     List<User> UserList;

    public UserDao()
    {
        System.out.println("This is a Dummy User");
        UserList = new ArrayList<>() ;
        UserList.add(new User(1 ,"Srushti_Dafe","10-11-2000","srushtidafe2000@gmail.com","9145361045" ,"2023-12-12" ,"10:30"));

    }

    public List<User> fetchAll() {
        return UserList;
    }

    public List<User> getUsersFromDatabase() {
        return UserList;
    }

    public boolean save(User user) {
        UserList.add(user);
        return true;
    }

    public boolean update(Integer userId, String userName) {
        boolean updateStatus = false;
        for (User user : UserList) {
            if (user.getUserId().equals(userId)){

                remove(user);

                user.setUserName(userName);

                save(user);

                return true;
            }
        }
        return false;
    }

    public boolean remove(User user) {
        UserList.remove(user);
        return true;
    }

}
