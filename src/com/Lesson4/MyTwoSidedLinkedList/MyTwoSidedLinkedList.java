package com.Lesson4.MyTwoSidedLinkedList;

import com.Lesson4.MyLinkedList.MyLinkedList;

public interface MyTwoSidedLinkedList<E> extends MyLinkedList<E> {
    void insertLast(E value);
}
