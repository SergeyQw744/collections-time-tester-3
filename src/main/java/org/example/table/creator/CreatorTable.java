package org.example.table.creator;

import org.example.table.entity.Measure;

import java.util.List;

public interface CreatorTable {
    List<Measure> create(int numberOfExecutions);
    void printTable(int numberOfExecutions);
}
