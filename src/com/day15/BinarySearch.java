package com.day15;

public class BinarySearch {
    Node root;

    BinarySearch(int key) {
        root = new Node(key);
    }

    BinarySearch() {
        root = null;
    }

    public void inorder(Node node) {
        if (root == null)
            System.out.println("Tree is empty");
        else {
            if (node.left != null)
                inorder(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearch b1=new BinarySearch();

        b1.root = new Node(56);
        b1.root.left = new Node(30);
        b1.root.right = new Node(70);

        b1.inorder(b1.root);
    }
}
