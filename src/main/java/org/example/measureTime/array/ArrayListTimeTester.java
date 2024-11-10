package org.example.measureTime.array;

import org.example.entity.User;
import org.example.init.InitializerListImpl;
import org.example.measureTime.TimeTester;

import java.util.*;

/**
 * Класс LinkedListTimeTester
 * Класс предназначен для замера времени выполнения операций над коллекцией ArrayList.
 * Поля класса: List<User> users - коллекция, initializer - объект, предназначенный для
 * заполнения коллекции, size - размер коллекции.
 * Данный класс имеет публичные методы:
 * @see #getTimeAddUsers()
 * @see #getTimeGetUsers()
 * @see #getTimeDeleteUsers()
 * @see #getTimeSetUsers()
 * @see #getTimeContainsUsers()
 * @see #getTimeSortUsers()
 */
public class ArrayListTimeTester implements TimeTester {
    private List<User> users = new ArrayList<>();

    private InitializerListImpl initializer;

    private int size;

    public ArrayListTimeTester(int size){
        this.size = size;
        this.initializer = new InitializerListImpl();
    }

    /**
     * Метод getTimeAddUsers()
     * Метод не принимает на вход никаких параметров. Метод возвращает время в миллисекундах.
     * Происходит замер времени выполнения некоторого количества добавлений в список с помощью
     * классов Data и InitializerListImpl.
     * @see InitializerListImpl
     * @see Date
     */
    @Override
    public long getTimeAddUsers(){
        Date start = new Date();
        users = initializer.fill(size, users);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    /**
     * Метод getTimeGetUsers()
     * Метод не принимает на вход никаких параметров. Метод возвращает время в миллисекундах.
     * Сначала в список добавляется некоторое количество объектов (size) с помощью класса InitializerListImpl.
     * Дальше применяется метод get (чтение элемента по индексу) для каждого элемента списка. Параллельно
     * замеряется время с помощью класса Data.
     * @see InitializerListImpl
     * @see Date
     */
    @Override
    public long getTimeGetUsers(){
        users = initializer.fill(size, users);
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            User user = users.get(i);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    /**
     * Метод getTimeDeleteUsers()
     * Метод не принимает на вход никаких параметров. Метод возвращает время в миллисекундах.
     * Сначала в список добавляется некоторое количество объектов (size) с помощью класса InitializerListImpl.
     * Дальше применяется метод remove (удаление элемента по индексу) для каждого элемента списка. Параллельно
     * замеряется время с помощью класса Data.
     * @see InitializerListImpl
     * @see Date
     */
    @Override
    public long getTimeDeleteUsers(){
        users = initializer.fill(size, users);
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            users.remove(0);
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    /**
     * Метод getTimeSetUsers()
     * Метод не принимает на вход никаких параметров. Метод возвращает время в миллисекундах.
     * Сначала в список добавляется некоторое количество объектов (size) с помощью класса InitializerListImpl.
     * Дальше применяется метод set (добавление элемента по индексу) для каждого элемента списка. Параллельно
     * замеряется время с помощью класса Data.
     * @see InitializerListImpl
     * @see Date
     */
    @Override
    public long getTimeSetUsers(){
        users = initializer.fill(size, users);
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            users.set(i, new User(i, "second-username" + i, "second-password" + i));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    /**
     * Метод getTimeContainsUsers()
     * Метод не принимает на вход никаких параметров. Метод возвращает время в миллисекундах.
     * Сначала в список добавляется некоторое количество объектов (size) с помощью класса InitializerListImpl.
     * Дальше применяется метод contains (поиск элемента по значению) для каждого элемента списка. Параллельно
     * замеряется время с помощью класса Data.
     * @see InitializerListImpl
     * @see Date
     */
    @Override
    public long getTimeContainsUsers() {
        users = initializer.fill(size, users);
        Date start = new Date();
        for (int i = 0; i < 10000; i++){
            users.contains(new User(i, "user"+ i, "password" + i));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    /**
     * Метод getTimeSortUsers()
     * Метод не принимает на вход никаких параметров. Метод возвращает время в миллисекундах.
     * Сначала в список добавляется некоторое количество объектов (size) с помощью класса InitializerListImpl.
     * Дальше применяется метод sort (сортировка списка). Сортировка объектов класса User из списка происходит
     * по полю username.
     * @see InitializerListImpl
     * @see Date
     */
    @Override
    public long getTimeSortUsers() {
        users = initializer.fillInReverseOrder(size, users);
        Date start = new Date();
        Collections.sort(users);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
}
