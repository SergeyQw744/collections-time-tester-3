package org.example.init;

import org.example.entity.User;

import java.util.List;

/**
 * Класс InitializerListImpl
 * Этот класс является реализацией интерфейса InitializerList<T>.
 * Предназначен для заполнения списков. Имеет публичные методы для
 * заполнения списка в порядке возрастания id и в порядке убывания.
 * Получаем список объектов вида User(id, user+id, password+id).
 * @see #fill(int num, List users)
 * @see #fillInReverseOrder(int num, List users)
 */
public class InitializerListImpl implements InitializerList<User> {

    /**
     * Метод fill(int num, List<User> users)
     * Метод принимает на вход целое число, обозначающее размер предполагаемого списка,
     * и сам список объектов класса User, который надо заполнить. Метод возвращает
     * заполненный список. Заполнение происходит в цикле по возрастанию id.
     * @param num размер заполненного списка
     * @param users заполняемый список
     */
    @Override
    public List<User> fill(int num, List<User> users) {
        for (int i = 0; i < num; i++){
            int value = i+1;
            users.add(new User(i + 1, "user"+ value, "password" + value));
        }
        return users;
    }
    /**
     * Метод fillInReverseOrder(int num, List<User> users)
     * Метод принимает на вход целое число, обозначающее размер предполагаемого списка,
     * и сам список объектов класса User, который надо заполнить. Метод возвращает
     * заполненный список. Заполнение происходит в цикле по убыванию id.
     * @param num размер заполненного списка
     * @param users заполняемый список
     */
    @Override
    public List<User> fillInReverseOrder(int num, List<User> users) {
        for (int i = num; i > 0; i--){
            users.add(new User(i, "user"+ i, "password" + i));
        }
        return users;
    }
}
