package com.company;

public class Trees {
    Node root;

    public void insert(int val){
        Node newNode = new Node(val);
        if(root == null){
            root = newNode;
        }
        else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if(val < current.value){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

}
