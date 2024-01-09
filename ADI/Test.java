import java.util.*;

public class Test {

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int x) {
            this.data = x;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            Node currNode = q.poll();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.offer(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.offer(currNode.left);
                }
                if (currNode.right != null) {
                    q.offer(currNode.right);
                }

            }
        }
    }

    public static void inOrder(Node root2) {
        if (root2 != null) {
            inOrder(root2.left);
            System.out.print(root2.data + " ");
            inOrder(root2.right);
        }
    }

    public static Node insertBt(Node root2, int val) {
        if (root2 == null) {
            root2 = new Node(val);
            return root2;
        }

        if (root2.data > val) {
            root2.left = insertBt(root2.left, val);
        } else {
            root2.right = insertBt(root2.right, val);
        }

        return root2;

    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preOrder(root);
        // levelOrder(root);

        // for bst

        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root2 = null;

        for (int i = 0; i < value.length; i++) {
            root2 = insertBt(root2, value[i]);
        }

        inOrder(root2);
        System.out.println();

    }

}
