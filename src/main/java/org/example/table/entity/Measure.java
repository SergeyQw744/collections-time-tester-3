package org.example.table.entity;

/**
 * Класс Measure
 * Класс имеет три поля: operation - операция, для которой происходит замер времени
 * arrayOperationTime - время выполнения некоторого количества выбранной операции для
 * коллекции ArrayList, linkedOperationTime - время выполнения некоторого количества
 * выбранной операции для коллекции LinkedList.
 */
public class Measure {
    private long arrayOperationTime;
    private long linkedOperationTime;
    private OperationEnum operation;

    public Measure(long arrayOperationTime, long linkedOperationTime, OperationEnum operation) {
        this.arrayOperationTime = arrayOperationTime;
        this.linkedOperationTime = linkedOperationTime;
        this.operation = operation;
    }

    public long getArrayOperationTime() {
        return arrayOperationTime;
    }

    public void setArrayOperationTime(long arrayOperationTime) {
        this.arrayOperationTime = arrayOperationTime;
    }

    public long getLinkedOperationTime() {
        return linkedOperationTime;
    }

    public void setLinkedOperationTime(long linkedOperationTime) {
        this.linkedOperationTime = linkedOperationTime;
    }

    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }
}
