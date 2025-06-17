import java.util.LinkedList;
import java.util.Queue;
class Node{
    public int data;
    public Node left, right;
    public Node(int data){
        data = data;
        left = right = null;
    }
}

public class BinaryTree{
    static Node newNode(int data){
        return new Node(data);
    }
    static int getLeafCount(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left != null || temp.right != null){
                count++;
            }
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        return count;
    }
    public static void main(String args[]){
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        System.out.println("Non-leaf count of the tree is : " + getLeafCount(root));
    }
}