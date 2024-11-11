package org.example;

import org.example.table.creator.CreatorTableImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CreatorTableImpl creator = new CreatorTableImpl();
        creator.printTable(10000);
    }
}
