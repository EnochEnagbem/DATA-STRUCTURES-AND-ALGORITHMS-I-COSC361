package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList  list =  new LinkedList();    //creating instance of the LL class

        list.push(8);//insert new element at the front stack
        list.append(10);//insert new element the end stack
        list.append(12);//insert new element the end stack
        list.append(16);//insert new element the end stack
        list.append(9);//insert new element the end stack
        list.append(14);//insert new element the end stack
        printList(list);//Display all the element in the list
        System.out.println("");
        list.push(15);//insert new element the end stack
        printList(list);//Display all the element in the list
        System.out.println("");
        list.insertAfter(5,25);//insert new element at a particular position in the list
        printList(list);//Display all the element in the list
        System.out.println("");
        list.insertAfter(3,30);//insert new element at a particular position in the list
        printList(list);//Display all the element in the list
        System.out.println("");
        list.append(45);//insert new element the end stack
        printList(list);//Display all the element in the list
        System.out.println("");
        list.deleteNode(2);//Delete element a particular index
        printList(list);//Display all the element in the list
        System.out.println("");
    }


    // A method to display all the element in the list
    public static void printList(LinkedList list)
    {
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        while (currentNode != null) {

            System.out.print(currentNode.data + " ");

            // Go to next node
            currentNode = currentNode.next;
        }
    }
}
