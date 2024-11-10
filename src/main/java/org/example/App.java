package org.example;

import org.example.measureTime.array.ArrayListTimeTester;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayListTimeTester tester = new ArrayListTimeTester(10000);
        System.out.println(tester.getTimeAddUsers());
        System.out.println(tester.getTimeGetUsers());
        System.out.println(tester.getTimeDeleteUsers());
        System.out.println(tester.getTimeSetUsers());
        System.out.println(tester.getTimeContainsUsers());
        System.out.println(tester.getTimeSortUsers());
    }
}
