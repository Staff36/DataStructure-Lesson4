package com.Lesson4;


import com.Lesson4.TestingClasses.LinkIteratorApp;
import com.Lesson4.TestingClasses.TestIterators;

public class Main {

    public static void main(String[] args) {
        // Testing LinkIteratorApp(task2)
        System.out.println("Task2");
        LinkIteratorApp.testLinkIterator();
        System.out.println();
        //Testing my iterator implementation(task3)
        System.out.println("Task3");
        TestIterators testIterators= new TestIterators();
        testIterators.fillTheCollections(10);
        testIterators.makeTests();

    }
}
