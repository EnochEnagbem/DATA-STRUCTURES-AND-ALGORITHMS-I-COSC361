package com.company;

import java.util.NoSuchElementException;

public class Stack<T> {
    Node<T> top = null;//Create a node(element) at the top of the stack
    int count = 0;


    /**
     * A method to add a new node at the top of the stack
     * @param new_data
     *
     * */
    public void push(T new_data){
        Node new_node = new Node(new_data);//Create a new node
        new_node.next = top; //Set the newNode next  value as the top of the stack
        top= new_node;//Set the top of the stack as the newNode
        count++;
    }


    /**
     *
     * A method to print all the elements in the stack
     * @param stackLinkedList as an argument
     *
     * */
    public void printStack(Stack stackLinkedList)
    {
        Node currentNode = stackLinkedList.top;//Create a new node and assign with the top value

        System.out.println("Stack");
        System.out.println("--------");

        while (currentNode != null)//Check if the list is not empty
        {

            System.out.println(currentNode.data);//Display an element in the stack

            // Go to next node
            currentNode = currentNode.next;//Move to the next element in the stack
        }
    }

    /**
     * A method to check if the stack is empty
     * @return null if the stack is empty
     * */
    public boolean isEmpty()
    {
        return top == null;
    }


    /**
     * A method to delete the element at the top of the stack
     * @return value the delete element from the list
     * */
    public T pop(){
        if (top == null) {
            return null;//Return null if the list is empty
        }
        T value = top.data;//create a new value and assign it with the value at the top
        top = top.next;//Set the top as top next value
        count--;
        return value;//Return the value pop

    }

    /**
     *A method to get the element at the top of the stack
     * @return node return the element at the top of the stack
     *
     * */

    public T peek()
    {

        if (top == null)//Check if the stack is empty
        {
            throw new NoSuchElementException();//Throw an exception if the stack is empty
        }
        else
        {
            T node = top.data;//Create a new node and assign the element at the top to it
            return node;//Return the element at the top of the stack
        }
    }


    /**
     *
     * This method determine the length of the stack
     * @param stackLinkedList
     * @return count return the length of the stack
     * */
    public int length(Stack stackLinkedList){


        return count;//return the length of the stack

    }

    //Remove all the element from the stack
    public void clear(){
        while (!isEmpty())//Check if the stack is not empty
        {
            pop();//Keep removing the elements until they are empty

        }
        count = 0;
    }





}

