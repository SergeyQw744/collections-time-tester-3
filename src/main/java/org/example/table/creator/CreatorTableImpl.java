package org.example.table.creator;

import org.example.measureTime.array.ArrayListTimeTester;
import org.example.measureTime.linked.LinkedListTimeTester;
import org.example.table.entity.Measure;
import org.example.table.entity.OperationEnum;

import java.util.List;

/**
 * Класс CreatorTableImpl
 * Класс предназначен для создания и вывода таблицы, содержащей результаты измерений
 * времени выполнения операций над коллекциями ArrayList и LinkedList.
 * Данный класс имеет публичные методы:
 * @see #create(int numberOfExecutions)
 * @see #printTable(int numberOfExecutions)
 */
public class CreatorTableImpl implements  CreatorTable{

    /**
     * Метод create(int numberOfExecutions)
     * Метод принимает на вход целое число - размер обеих коллекций. Метод возвращает список объектов
     * класса Measure, которые являются результатами замеров времени выполнения каждой операции.
     * Сначала создаются объекты классов ArrayListTimeTester и LinkedListTimeTester для замера времени.
     * Потом вычисляется время выполнения каждой операции и полученные данные записываются в возвращаемый
     * список.
     * @param numberOfElements размер ArrayListTimeTester и LinkedListTimeTester
     * @see ArrayListTimeTester
     * @see LinkedListTimeTester
     * @see Measure
     */
    @Override
    public List<Measure> create(int numberOfElements) {
        ArrayListTimeTester arrayTester = new ArrayListTimeTester(numberOfElements);
        LinkedListTimeTester linkedTester = new LinkedListTimeTester(numberOfElements);
        List<Measure> measurements = List.of(
                new Measure(arrayTester.getTimeAddUsers(), linkedTester.getTimeAddUsers(), OperationEnum.ADD),
                new Measure(arrayTester.getTimeGetUsers(), linkedTester.getTimeGetUsers(), OperationEnum.GET),
                new Measure(arrayTester.getTimeDeleteUsers(), linkedTester.getTimeDeleteUsers(), OperationEnum.DEL),
                new Measure(arrayTester.getTimeSetUsers(), linkedTester.getTimeSetUsers(), OperationEnum.SET),
                new Measure(arrayTester.getTimeContainsUsers(), linkedTester.getTimeContainsUsers(), OperationEnum.CONT),
                new Measure(arrayTester.getTimeSortUsers(), linkedTester.getTimeSortUsers(), OperationEnum.SORT)
        );
        return measurements;
    }

    /**
     * Метод printTable(int numberOfElements)
     * Метод принимает на вход целое число - размер обеих коллекций. Метод ничего не возвращает.
     * Сначала создается список измерений времени для каждой операции над обеими коллекциями с
     * помощью метода create(int numberOfElements), затем эти данные выводятся в консоль в цикле.
     * @param numberOfElements размер ArrayListTimeTester и LinkedListTimeTester
     * @see #create(int numberOfElements)
     */
    @Override
    public void printTable(int numberOfElements) {
        List<Measure> measurements = create(numberOfElements);
        System.out.println("                      Функ." + "                  " + "array" + "                  " + "linked");
        for (int i = 0; i < 6; i++){
            System.out.println(measurements.get(i));
        }
    }
}
