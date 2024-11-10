package org.example.init;

import java.util.List;

/**
 * Интерфейс InitializerList
 * Требуется переопределить два метода: List<T> fill(int num, List<T> list) и
 * List<T> fillInReverseOrder(int num, List<T> list). Позволяет инициализировать
 * список. Данный интерфейс может быть переопределен для параметризован любым
 * типом, в зависимости от параметризации заполняемого списка.
 */
public interface InitializerList<T>{

    List<T> fill(int num, List<T> list);

    List<T> fillInReverseOrder(int num, List<T> list);
}
