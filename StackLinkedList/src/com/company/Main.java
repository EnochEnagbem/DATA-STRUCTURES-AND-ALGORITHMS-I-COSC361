package com.company;

public class Main {

	public static void main(String[] args) {

		Stack stackLinkedList = new Stack();//Create instance of the stack class

		//Check the status of the stack
		System.out.println("Empty Status :" + stackLinkedList.isEmpty());
		stackLinkedList.push(6); //add a new element to the stack
		stackLinkedList.push("Hello");//add another element on top of it
		stackLinkedList.push("Enoch");//add another element on top of it
		stackLinkedList.printStack(stackLinkedList);//Display all the element in the stack
		stackLinkedList.pop();//Delete the element at the top of the stack
		System.out.println();
		stackLinkedList.printStack(stackLinkedList);//Display all the element in the stack after deletion
		stackLinkedList.push("James");//add another element on top of it
		stackLinkedList.push(4.32);//add another element on top of it
		stackLinkedList.push(5000);//add another element on top of it
		stackLinkedList.push("Tyler");//add another element on top of it
		System.out.println();
		stackLinkedList.printStack(stackLinkedList);//Display all the element in the stack
		System.out.println("Empty Status :" + stackLinkedList.isEmpty());//Check if the list is empty
		//Display the number of element in the stack
		System.out.println("The length of the stack is: " + stackLinkedList.length(stackLinkedList));

		//Get the element at the top of the stack
		System.out.println("The element at the top of the stack is "
				+ stackLinkedList.peek());

		stackLinkedList.clear();
		//Display the number of element in the stack again
		System.out.println("The length of the stack is: " +
				stackLinkedList.length(stackLinkedList));
	}


}
