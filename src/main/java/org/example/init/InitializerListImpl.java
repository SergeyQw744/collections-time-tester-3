package org.example.init;

import org.example.entity.User;

import java.util.List;

public class InitializerImpl implements Initializer<User>{
    @Override
    public List<User> fill(int num, List<User> users) {
        for (int i = 0; i < num; i++){
            users.add(new User(i+1, "user"+ i, "password" + i));
        }
        return users;
    }
    @Override
    public List<User> filInReverseOrder(int num, List<User> users) {
        for (int i = num; i > 0; i--){
            users.add(new User(i+1, "user"+ i, "password" + i));
        }
        return users;
    }
}
