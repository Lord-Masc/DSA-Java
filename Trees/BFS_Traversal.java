
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right =null;
    }
}
public class BFS_Traversal{

    static  void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!(q.isEmpty())) {
            Node currentNode = q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                System.out.print(currentNode.data+ " ");
                if(currentNode.left!=null) q.add(currentNode.left);
                if(currentNode.right!=null) q.add(currentNode.right);
            }
        }
    }
    public static void main(String []args){
        // 🔹 Creating nodes
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        // 🔹 BFS Traversal
        BFS_Traversal tree = new BFS_Traversal();
        tree.levelOrder(root);


        
    }
}