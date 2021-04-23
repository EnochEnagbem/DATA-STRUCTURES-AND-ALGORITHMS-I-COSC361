package com.company;

public class Main {

    public static void main(String[] args) {

    //Create instance of the binary tree class
	BinaryTree binarytree = new BinaryTree();

	binarytree.insert(5);//Add an element to the tree
	binarytree.insert(3);//Add another element to the tree
	binarytree.insert(1);//Add another element to the tree
	binarytree.insert(10);//Add another element to the tree
	binarytree.insert(100);//Add another element to the tree
	binarytree.insert(57);//Add another element to the tree
	binarytree.insert(99);//Add another element to the tree

	//Store the depth of the tree in num
	int num = binarytree.Depth();

	//Display the size of the tree
	System.out.println("The size is: " + binarytree.size());
	//Display the depth of the tree
	System.out.println("The depth of the tree is " + num);
	//Display all the elements in the tree
	System.out.print("The Elements in the tree are: ");
	binarytree.printTree();
	//Display the root node in the tree
	binarytree.Root();

    }
}
