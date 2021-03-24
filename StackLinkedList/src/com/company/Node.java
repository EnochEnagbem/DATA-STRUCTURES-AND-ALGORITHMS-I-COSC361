package com.company;
/**
 *
 * @author Enagbem Enoch
 *
 * */



public class Node<T> {

    T data;//Create a data field
    Node next;//Create a node field

    /**
     * A constructor
     * @param data
     *
     * */
    Node(T data) {    // constructor

        this.data = data;//initialize the data part of the node
        next = null;//initialize the next part of the node as null
    }

}

