package org.example.init;

import org.example.entity.User;
import org.example.exception.FillListException;

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
     * и сам список объектов класса User, который надо заполнить. Сначала происходит валидация
     * входных параметров с помощью метода validation(int num, List<User> list). Метод возвращает
     * заполненный список. Заполнение происходит в цикле по возрастанию id.
     * @param num размер заполненного списка
     * @param users заполняемый список
     * @see #validation(int num, List list)
     */
    @Override
    public List<User> fill(int num, List<User> users) {
        String message = validation(num, users);
        if (message.isBlank()){
            for (int i = 0; i < num; i++){
                int value = i+1;
                users.add(new User(i + 1, "user"+ value, "password" + value));
            }
            return users;
        } else {
            throw new FillListException(message);
        }
    }
    /**
     * Метод fillInReverseOrder(int num, List<User> users)
     * Метод принимает на вход целое число, обозначающее размер предполагаемого списка,
     * и сам список объектов класса User, который надо заполнить. Сначала происходит валидация
     * входных параметров с помощью метода validation(int num, List<User> list). Метод возвращает
     * заполненный список. Заполнение происходит в цикле по убыванию id.
     * @param num размер заполненного списка
     * @param users заполняемый список
     * @see #validation(int num, List list)
     */
    @Override
    public List<User> fillInReverseOrder(int num, List<User> users) {
        String message = validation(num, users);
        if (message.isBlank()){
            for (int i = num; i > 0; i--){
                users.add(new User(i, "user"+ i, "password" + i));
            }
            return users;
        } else {
            throw new FillListException(message);
        }
    }

    /**
     * Метод validation(int num, List<User> list)
     * Метод принимает на вход целое число, обозначающее размер предполагаемого списка,
     * и сам список объектов класса User, который надо заполнить. Сначала метод проверяет
     * число num, чтобы оно не было отрицательным, а потом происходит проверка списка,
     * чтобы он был не заполнен.
     * @param num размер заполненного списка
     * @param list заполняемый список
     */
    private String validation(int num, List<User> list){
        StringBuilder errorMessage = new StringBuilder();
        if (num < 0){
            errorMessage.append("Размер списка не может быть отрицательным! ");
        }
        if (!list.isEmpty()){
            errorMessage.append("Передаваемый список должен быть пуст!");
        }
        return errorMessage.toString();
    }
}
