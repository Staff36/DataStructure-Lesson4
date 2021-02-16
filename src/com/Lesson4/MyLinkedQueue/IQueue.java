package com.Lesson4.MyLinkedQueue;

public interface IQueue <E> extends Iterable<E>{
    boolean insert(E value);
    E remove();
    E peekHead();
    int size();
    boolean isEmpty();
    boolean isFull();
}
