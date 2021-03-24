package com.company;
public class Main {

    public static void main(String[] args) {
        //Create an instance of the queue stack class
	    QueueLinkedList queue = new QueueLinkedList();
	    queue.enqueue("Enoch");//Add a new element to the queue
        queue.enqueue("James");//Add a new element to the queue
        queue.enqueue("Eli");//Add a new element to the queue
        queue.enqueue("Bobi");//Add a new element to the queue
        queue.enqueue(24);//Add a new element to the queue
        queue.enqueue(23.4);//Add a new element to the queue
        queue.dequeue();//Remove the first element in the queue
        queue.printQueue(queue);//Display the elements in the queue
        //Display the element at the front of the queue
        System.out.println("The element at the front is " + queue.front());
        //Display the size of the queue
        System.out.println("The size of the queue is " + queue.length());
        queue.clear();//Remove all the element in the queue
        //Display the size of the queue
        System.out.println("The size of the queue is " + queue.length());
    }
}
