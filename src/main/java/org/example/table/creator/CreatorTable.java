package org.example.table.creator;

import org.example.table.entity.Measure;

import java.util.List;

/**
 * Интерфейс CreatorTable.
 * Требуется переопределить два метода: List<Measure> create(int numberOfExecutions)
 * и void printTable(int numberOfExecutions). Позволяет выстроить таблицу измерений
 * и вывести результат в консоль.
 */
public interface CreatorTable {
    List<Measure> create(int numberOfElements);
    void printTable(int numberOfElements);
}
