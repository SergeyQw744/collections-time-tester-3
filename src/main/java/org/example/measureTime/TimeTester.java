package org.example.measureTime;

/**
 * Интерфейс TimeTester.
 * Позволяет реализовывать классы для замера методов коллекций
 * (ArrayList и LinkedList).
 */
public interface TimeTester {

    long getTimeAddUsers();

    long getTimeGetUsers();

    long getTimeDeleteUsers();

    long getTimeSetUsers();

    long getTimeContainsUsers();

    long getTimeSortUsers();
}
