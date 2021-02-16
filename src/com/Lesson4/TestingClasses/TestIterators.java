package com.Lesson4.TestingClasses;

import com.Lesson4.MyLinkedList.MyLinkedList;
import com.Lesson4.MyLinkedList.MyLinkedListImpl;
import com.Lesson4.MyStack.ArrayStackImpl;
import com.Lesson4.MyStack.MyLinkedStack;
import com.Lesson4.MyTwoSidedLinkedList.MyTwoSidedLinkedList;
import com.Lesson4.MyTwoSidedLinkedList.MyTwoSidedLinkedListImpl;

public class TestIterators {
    MyLinkedList<Integer> myLinkedList= new MyLinkedListImpl<>();
    MyTwoSidedLinkedList<Integer> myTwoSideLinkedList = new MyTwoSidedLinkedListImpl<>();
    MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();
    ArrayStackImpl<Integer> arrayStack;
       public void fillTheCollections(int size){
           arrayStack= new ArrayStackImpl<>(size);
           for (int i = 0; i < size; i++) {
               myLinkedList.insertFirst(i);
               myTwoSideLinkedList.insertFirst(i);
               myTwoSideLinkedList.insertLast(i*10);
               myLinkedStack.push(i);
               arrayStack.push(i*10);
           }
       }
        public void makeTests(){

        System.out.println("Test linkedList iterator:");
        for (Integer value:myLinkedList) System.out.println(value);

        System.out.println("\nTest two-side linkedlist iterator:");
        for (Integer value: myTwoSideLinkedList)
            System.out.println(value);

        System.out.println("\nTest Stack iterator:");
        for (Integer value: myLinkedStack)
            System.out.println(value);

        System.out.println("\nTest ArrayStack iterator");
        for (Integer integer :arrayStack)
            System.out.println(integer);


}
}
