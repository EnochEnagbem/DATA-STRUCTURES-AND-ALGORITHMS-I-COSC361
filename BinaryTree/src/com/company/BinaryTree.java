package com.company;

public class BinaryTree {
    Node root;



    //A method to insert an element in the tree
    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }



    //A method to get the size of the tree
    public int size() {
        return size(root);
    }

    public  int size(Node node) {
        if (node == null) return 0;
        return (size(node.left) + size(node.right) + 1);
    }

    //A method to display all the elements in the tree
    public void printTree(){
        printTree(root);
        System.out.println();
    }

    public void printTree(Node node) {
        if (node == null) return;
        printTree(node.left);
        System.out.print(node.data + " ");
        printTree(node.right);
    }




    //A method to get root node in the tree
    public Node Root() {
        return root;
    }



    //A method to get the depth of the tree
    public int Depth() {
        return Depth(root);
    }
    public int Depth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = Depth(node.left);
            int rightDepth = Depth(node.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }




}
