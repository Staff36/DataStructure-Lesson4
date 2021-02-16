package com.Lesson4.MyTwoSidedLinkedList;

import com.Lesson4.MyLinkedList.MyLinkedListImpl;
import java.util.Iterator;

public class MyTwoSidedLinkedListImpl<E> extends MyLinkedListImpl<E> implements MyTwoSidedLinkedList<E> {
   private Node<E> lastElement;

    @Override
    public void insertLast(E value) {
        Node<E> newNode= new Node<>(value,null);
        if (isEmpty())
            firstElement=newNode;
        else
            lastElement.next=newNode;

        lastElement= newNode;
        size++;
    }

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (size==1)
            lastElement=firstElement;
    }

    @Override
    public E removeFirst() {
        E removedValue= super.removeFirst();
        if (isEmpty())
            lastElement=null;
        return removedValue;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = firstElement;
        Node<E> previous=null;

        while (current!=null){
        if (current.item.equals(value))
            break;
        previous=current;
        current=current.next;
        }

        if (current==null)
            return false;

        if (size==1)
            return removeFirst()!=null;


        if(current==firstElement){
            firstElement=firstElement.next;
        }
        else if(current==lastElement){
            lastElement=previous;
            previous.next=null;
        }
        else {
            previous.next = current.next;
        }
        current.next=null;
        size--;
        return true;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator<E>(this);
    }

    class MyLinkedListIterator<E> implements Iterator<E>{
        private Node<E> current;

        public MyLinkedListIterator(MyLinkedListImpl<E> list) {
            this.current = list.getFirstNode();

        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public E next() {
           E data= current.item;
           current=current.next;
            return data;
        }

    }

}
