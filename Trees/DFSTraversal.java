
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class DFSTraversal {

    static void inTraversal(Node root) {

        if (root == null) {
            return;
        }
        inTraversal(root.left);
        System.out.print(root.data + " ");
        inTraversal(root.right);

    }

    static void preTraversal(Node root){
        if(root == null) return;
        System.out.print(root.data+ " ");
        preTraversal(root.left);
        preTraversal(root.right);
    }
    static void postTraversal(Node root){
        if(root == null) return;
        postTraversal(root.left);
        postTraversal(root.right);
        System.out.print(root.data+ " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        inTraversal(root);
        System.out.println();
        preTraversal(root);
        System.out.println();
        postTraversal(root);
    }
}
