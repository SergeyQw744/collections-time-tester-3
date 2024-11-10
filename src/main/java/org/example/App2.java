package org.example;

import org.example.measureTime.linked.LinkedListTimeTester;

public class App2 {
    public static void main(String[] args){
        LinkedListTimeTester tester = new LinkedListTimeTester(10000);
        System.out.println(tester.getTimeAddUsers());
        System.out.println(tester.getTimeGetUsers());
        System.out.println(tester.getTimeDeleteUsers());
        System.out.println(tester.getTimeSetUsers());
        System.out.println(tester.getTimeContainsUsers());
        System.out.println(tester.getTimeSortUsers());
    }
}
