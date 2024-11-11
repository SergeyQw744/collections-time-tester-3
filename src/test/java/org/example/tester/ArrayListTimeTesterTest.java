package org.example.tester;

import org.example.measureTime.array.ArrayListTimeTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ArrayListTimeTesterTest {
    @InjectMocks
    ArrayListTimeTester tester = new ArrayListTimeTester(10000);

    @Test
    void testGetTimeAddUsers_returnedTimeInMillis(){
        long time = tester.getTimeAddUsers();
        assertTrue(time <= 30);
    }

    @Test
    void testGetTimeGetUsers_returnedTimeInMillis(){
        long time = tester.getTimeGetUsers();
        assertTrue(time <= 10);
    }

    @Test
    void testGetTimeDeleteUsers_returnedTimeInMillis(){
        long time = tester.getTimeDeleteUsers();
        assertTrue(time <= 15);
    }

    @Test
    void testGetTimeSetUsers_returnedTimeInMillis(){
        long time = tester.getTimeSetUsers();
        assertTrue(time <= 10);
    }

    @Test
    void testGetTimeContainsUsers_returnedTimeInMillis(){
        long time = tester.getTimeContainsUsers();
        assertTrue(time <= 150);
    }

    @Test
    void testGetTimeSortUsers_returnedTimeInMillis(){
        long time = tester.getTimeSortUsers();
        assertTrue(time <= 10);
    }
}
