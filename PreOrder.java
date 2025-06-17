import java.util.Queue;
import java.util.LinkedList;
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
class PreOrder{
    static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int nonNull = 1;
        while (!queue.isEmpty() && nonNull > 0) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            nonNull--;
            System.out.print(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
            if (curr.left != null)
                nonNull++;
            if (curr.right != null)
                nonNull++;
        }
    }
    static int search(int[] inorder, int value, int left, int right) {
        for (int i = left; i <= right; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }
    static Node buildTreeRecur(int[] inorder, int[] preorder, int[] preIndex, int left, int right) {
        if (left > right)
            return null;
        int rootVal = preorder[preIndex[0]];
        preIndex[0]++;
        Node root = new Node(rootVal);
        int index = search(inorder, rootVal, left, right);
        root.left = buildTreeRecur(inorder, preorder, preIndex, left, index - 1);
        root.right = buildTreeRecur(inorder, preorder, preIndex, index + 1, right);

        return root;
    }
    static Node buildTree(int[] inorder, int[] preorder) {
        int[] preIndex = {0};
        return buildTreeRecur(inorder, preorder, preIndex, 0, preorder.length - 1);
    }

    public static void main(String[] args) {
        int[] inorder = {3, 1, 4, 0, 5, 2};
        int[] preorder = {0, 1, 3, 4, 2, 5};

        Node root = buildTree(inorder, preorder);
        printLevelOrder(root);
    }
}
