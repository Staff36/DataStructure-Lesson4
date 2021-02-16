package com.Lesson4.MyLinkedList;

public interface MyLinkedList<E> extends Iterable<E>{
    void insertFirst(E value);
    E removeFirst();
    boolean remove(E value);
    boolean contains(E value);
    int size();
    boolean isEmpty();
    void display();
    E getFirst();
    Node<E> getFirstNode();

    class Node<E>{
    public E item;
    public Node<E> next;
    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

    }
}

