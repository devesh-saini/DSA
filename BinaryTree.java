/**
 * BinaryTree
 */
public class BinaryTree {
    static TreeNode root = new TreeNode(9999);

    public static void main(String[] args) {
        root.append(5);
        root.append(10);
        root.Left.append(15);
        root.Left.append(20);
        root.Right.append(25);
        root.Right.append(30);
        root.Left.Left.append(35);
        root.Right.Right.append(40);

        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
    }

    private static void preOrderTraversal(TreeNode current) {

        if (current == null) {
            return ;
        }
        
        System.out.print(current.Data + " ");
        preOrderTraversal(current.Left);
        preOrderTraversal(current.Right);
    }

    private static void inOrderTraversal(TreeNode current) {
        if (current == null) {
            return;
        }

        inOrderTraversal(current.Left);
        System.out.print(current.Data + " ");
        inOrderTraversal(current.Right);
    }

    private static void postOrderTraversal(TreeNode current) {
        if (current == null) {
            return;
        }

        postOrderTraversal(current.Left);
        postOrderTraversal(current.Right);
        System.out.print(current.Data + " ");
    }
}

class TreeNode {

    int Data;
    TreeNode Left;
    TreeNode Right;

    TreeNode(int Data) {
        this.Data = Data;
    }

    void append(int data) {
        
        if (this.Left != null && this.Right != null) {
            System.out.println("Child Node can't be appended (No space available.)");
            return;
        }

        TreeNode newNode = new TreeNode(data);
        if (this.Left == null) {
            this.Left = newNode;
            return;
        }

        this.Right = newNode;
    }
}
