package com.Lesson4.MyStack;

import java.util.Iterator;

public class ArrayStackImpl<E> implements IStack<E> {

    private E[] data;
    private int size;

    public ArrayStackImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E value) {
        if (!isFull())
            data[size++] = value;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return data[--size];
    }

    @Override
    public E peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        if (size > 0) {
            sb.append(data[size - 1]);
        }
        sb.append("]");

        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            int index;
            @Override
            public boolean hasNext() {
                return index<size();
            }

            @Override
            public E next() {
                return pop();
            }
        };
    }
}
