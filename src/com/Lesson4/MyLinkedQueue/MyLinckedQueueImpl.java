package com.Lesson4.MyLinkedQueue;

import com.Lesson4.MyTwoSidedLinkedList.MyTwoSidedLinkedListImpl;
import com.Lesson4.MyTwoSidedLinkedList.MyTwoSidedLinkedList;

import java.util.Iterator;

public class MyLinckedQueueImpl<E> implements IQueue<E>{
    private MyTwoSidedLinkedList<E> data;

    public MyLinckedQueueImpl (){
        data= new MyTwoSidedLinkedListImpl<>();
    }
    @Override
    public boolean insert(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E remove() {
        return data.removeFirst();
    }

    @Override
    public E peekHead() {
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
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            @Override
            public boolean hasNext() {
                return data.iterator().hasNext();
            }

            @Override
            public E next() {
                return data.iterator().next();
            }
        };
    }
}
