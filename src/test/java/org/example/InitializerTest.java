package org.example;

import org.example.entity.User;
import org.example.init.InitializerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class InitializerTest {
    List<User> arrayListEmptyOfUsers;
    List<User> linkedListEmptyOfUsers;
    @InjectMocks
    InitializerListImpl initializer;

    @BeforeEach
    void initArrayAndLinked(){
        arrayListEmptyOfUsers = new ArrayList<>();
        linkedListEmptyOfUsers = new LinkedList<>();
    }
    @Test
    void testFill_returnsList(){
        List<User> actualArrayList = initializer.fill(3, arrayListEmptyOfUsers);
        List<User> actualLinkedList = initializer.fill(3, linkedListEmptyOfUsers);
        List<User> expectedList = List.of(new User(1, "user1", "password1"),
                new User(2, "user2", "password2"),
                new User(3, "user3", "password3"));
        assertEquals(expectedList, actualArrayList);
        assertEquals(expectedList, actualLinkedList);
    }
    @Test
    void testFillInReverseOrder_returnsList(){
        List<User> actualArrayList = initializer.fillInReverseOrder(3, arrayListEmptyOfUsers);
        List<User> actualLinkedList = initializer.fillInReverseOrder(3, linkedListEmptyOfUsers);
        List<User> expectedList = List.of(new User(3, "user3", "password3"),
                new User(2, "user2", "password2"),
                new User(1, "user1", "password1"));
        assertEquals(expectedList, actualArrayList);
        assertEquals(expectedList, actualLinkedList);
    }
}
