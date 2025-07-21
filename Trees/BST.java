package Trees;

import java.util.ArrayList;
import java.util.List;

public class BST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node insert(Node root, int d) {
        if (root == null) {
            root = new Node(d);
            return root;
        }
        if (root.val > d) {
            root.left = insert(root.left, d); // left side
        } else {
            root.right = insert(root.right, d); // right side
        }
        return root;
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
    }

    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return search(root.left, val); // left for smaller
        } else {
            return search(root.right, val); // right for greater
        }
    }
    public static Node delete(Node root,int val){
        if(root.val > val){
            root.left = delete(root.left, val);
        }
        else if(root.val < val){
            root.right = delete(root.right, val);
        }else{
            //Case-1
            if(root.left == null && root.right == null){
                return null;
            }
            //Case-2
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //Case-3
            Node Is = inOrderSucessor(root.right);
            root.val = Is.val;
            root.right = delete(root.right, Is.val);
        }
        return root;
    }
    public static Node inOrderSucessor(Node root){
        while (root.left != null) {
            root = root.right;
        }
        return root;
    }
    public static void printInRange(Node root,int A,int B){
        if(root == null) return;
        if(root.val >= A && root.val <= B){
            printInRange(root.left, A, B);
            System.out.print(root.val + " ");
            printInRange(root.right, A, B);
        }
        else if(root.val >= A){
            printInRange(root.left, A, B);
        }else{
            printInRange(root.right, A, B);
        }
    }
    public static void printPath(List<Integer> path){
        for(int i : path){
            System.out.print(i + "->");
        }
        System.out.println();
    }
    public static void printLeaf(Node root,List<Integer> path){
        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null){
            printPath(path);
        }else{
            printLeaf(root.left, path);
            printLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        InOrder(root);
        System.out.println();
        System.out.println(search(root, 4));
        delete(root, 5);
        InOrder(root);
        System.out.println();
        printInRange(root, 2, 4);
        System.out.println();
        printLeaf(root, new ArrayList<>());
    }
}
