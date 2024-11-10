package org.example.init;

import java.util.List;

public interface Initializer<T>{
    List<T> fill(int num, List<T> list);

    List<T> filInReverseOrder(int num, List<T> list);
}
