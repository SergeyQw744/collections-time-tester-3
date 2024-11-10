package org.example.table.creator;

import org.example.measureTime.array.ArrayListTimeTester;
import org.example.measureTime.linked.LinkedListTimeTester;
import org.example.table.entity.Measure;
import org.example.table.entity.OperationEnum;

import java.util.List;

public class CreatorTableImpl implements  CreatorTable{
    @Override
    public List<Measure> create(int numberOfExecutions) {
        ArrayListTimeTester arrayTester = new ArrayListTimeTester(numberOfExecutions);
        LinkedListTimeTester linkedTester = new LinkedListTimeTester(numberOfExecutions);
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

    @Override
    public void printTable(int numberOfExecutions) {
        List<Measure> measurements = create(numberOfExecutions);
        System.out.println("                      Функ." + "                  " + "array" + "                  " + "linked");
        for (int i = 0; i < 6; i++){
            System.out.println(measurements.get(i));
        }
    }
}
