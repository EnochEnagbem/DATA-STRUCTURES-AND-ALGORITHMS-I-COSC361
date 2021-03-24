package com.company;

public class LinkedList {
    Node head;   //head of the list

    /**
     * A method to insert element at the front of list
     * @param new_data
     * */
    public void push(int new_data){

        Node new_node = new Node(new_data);//Create new node and pass it the new data
        new_node.next = head;//Set the new node new as the head
        head = new_node;//Set new node as the head
    }

    /**
     * A method to insert element at the end of list
     * @param new_data
     * */
    public void append(int new_data){
        Node new_node = new Node(new_data);//Create new node and pass it the new data
        new_node.next = null;//Set the new node next as null

        if(head == null){//Check if the head is null
            head = new_node;//Set the new node as the head
        }
        else{
            Node node = head;//Create a new node and set it as the head
            while (node.next != null){//Loop from the start to the end of the list
                node = node.next;
            }
            node.next = new_node;
        }
    }
    /**
     * A method to insert at a particular position
     * @param index
     * @param new_data
     * */
    public void insertAfter(int index, int new_data){
        Node new_node = new Node(new_data);

        if(index == 0){
            push(new_data);
        }
        else{
            Node node = head;
            for(int i = 0; i< index - 1; i++){
                node = node.next;
            }
            new_node.next = node.next;
            node.next = new_node;
        }
    }

    /**
     * A method to delete at a particular location
     * @param index
     * */
    public void deleteNode(int index){

        if(index == 0){
            head = head.next;
        }
        else{
            Node new_node = head;
            Node temp = null;
            for(int i = 0; i< index-1; i++){
                new_node = new_node.next;
            }
            temp = new_node.next;
            new_node.next = temp.next;
            System.out.println("The deleted value  is " + temp.data);
        }
    }





}
