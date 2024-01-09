import java.util.*;

class Node {
    int data;
    Node right;
    Node left;

    Node(int x) {
        this.data = x;

    }
}

public class Tree {
    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return (Math.max(height(root.left), height(root.right)) + 1);
        }
    }

    public static void main(String[] args) {
        Node t = new Node(20);
        t.left = new Node(30);
        t.right = new Node(70);
        t.left.left = new Node(10);
        t.left.right = new Node(5);
        t.right.left = new Node(60);
        t.right.right = new Node(90);

        // inOrder(t);
        System.out.println(height(t));
    }

}
