package com.Lesson4.MyStack;

public interface IStack<E> extends Iterable<E> {

    void push(E value);

    E pop();

    E peek();

    int size();

    boolean isEmpty();

    boolean isFull();
    void display();

}
