package Trees;

import java.util.*;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class  BinaryTree {
        static int idx = -1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    public static void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void LevelOrder(Node root){
        if(root == null){ 
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cur = q.remove();
            if(cur == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(cur.data + " ");
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }
    }
    public static int CountNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = CountNodes(root.left);
        int rightNodes = CountNodes(root.right);
        return leftNodes + rightNodes + 1;
    }
    public static int SumofNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = SumofNodes(root.left);
        int right = SumofNodes(root.right);

        return left + right + root.data;
    }
    public static int HeightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int left = HeightOfTree(root.left);
        int right = HeightOfTree(root.right);
        int max = Math.max(left, right);
        return max + 1;
    }
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int d1 = Diameter(root.left);
        int d2 = Diameter(root.right);
        int d3 = HeightOfTree(root.left) + HeightOfTree(root.right) + 1;

        return Math.max(d3, Math.max(d1, d2));
    }
    public static class TreeInfo {
        int h;
        int d;
        TreeInfo(int h,int d){
            this.h = h;
            this.d = d;
        }
    }
    public static TreeInfo TreeDiameter(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left  = TreeDiameter(root.left);
        TreeInfo right = TreeDiameter(root.right);
        int height = Math.max(left.h , right.h) + 1;
        int d1 = left.d;
        int d2 = right.d;
        int d3 = left.h + right.h + 1;
        int max = Math.max(Math.max(d1, d2), d3);
        TreeInfo info = new TreeInfo(height, max);
        return info;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
        System.out.print("PreOrder Traversal :- ");
        preOrder(root);
        System.out.println(" ");
        System.out.print("InOrder Traversal :- ");
        InOrder(root);
        System.out.println(" ");
        System.out.print("PostOrder Traversal :- ");
        PostOrder(root);
        System.out.println(" ");
        System.out.print("LevelOrder Traversal :- ");
        LevelOrder(root);
        System.out.println("Count of Nodes :- " +CountNodes(root));
        System.out.println("Sum of Nodes :- " +SumofNodes(root));
        System.out.println("Height of Nodes :- " +HeightOfTree(root));
        System.out.println("Diameter (Approach 1) :- " +Diameter(root));
        System.out.println("Diameter (Approach 2) :- " +TreeDiameter(root).d);
    }
}
