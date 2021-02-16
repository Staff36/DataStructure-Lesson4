package com.Lesson4.MyStack;

import com.Lesson4.MyLinkedList.MyLinkedList;
import com.Lesson4.MyLinkedList.MyLinkedListImpl;

import java.util.Iterator;

public class MyLinkedStack<E> implements IStack<E> {
    private MyLinkedList<E> data;

    public MyLinkedStack() {
        this.data = new MyLinkedListImpl<>();
    }

    @Override
    public void push(E value) {
        data.insertFirst(value);

    }

    @Override
    public E pop() {

        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            MyLinkedList.Node<E> current= data.getFirstNode();
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public E next() {
            current=current.next;
                return pop();
            }
        };
    }
}
