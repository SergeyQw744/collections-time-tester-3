package org.example.array;

import org.example.entity.User;
import org.example.measureTime.TimeTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTimeTester implements TimeTester {
    private List<User> users = new ArrayList<User>();
    @Override
    public long getTimeAddUsers(){
        Date start = new Date();
        fillListOfPersons();
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    @Override
    public long getTimeGetUsers(){
        fillListOfPersons();
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            User user = users.get(i);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    @Override
    public long getTimeDeleteUsers(){
        fillListOfPersons();
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            users.remove(0);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    @Override
    public long getTimeSetUsers(){
        fillListOfPersons();
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            users.set(i, new User(i, "second-username" + i, "second-password" + i));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    @Override
    public long getTimeContainsUsers() {
        fillListOfPersons();
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            users.contains(new User(i, "user"+ i, "password" + i));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    @Override
    public long getTimeSortUsers(){
        fillInReversOrder();
        Date start = new Date();
        Collections.sort(users);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    private void fillListOfPersons(){
        for (int i = 0; i < 10000; i++){
            users.add(new User(i+1, "user"+ i, "password" + i));
        }
    }
    private void fillInReversOrder(){
        for (int i = 10000; i > 0; i--){
            users.add(new User(i+1, "user"+ i, "password" + i));
        }
    }
}
