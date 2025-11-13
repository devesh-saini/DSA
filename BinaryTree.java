/**
 * BinaryTree
 */
public class BinaryTree {
    public static void main(String[] args) {
//        root.append(5);
//        root.append(10);
//        root.Left.append(15);
//        root.Left.append(20);
//        root.Right.append(25);
//        root.Right.append(30);
//        root.Left.Left.append(35);
//        root.Right.Right.append(40);

//        preOrderTraversal(root);
//        System.out.println();
//        inOrderTraversal(root);
//        System.out.println();
//        postOrderTraversal(root);
//        System.out.println();
    
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        BinaryTreeClass Tree = new BinaryTreeClass();
        TreeNode root = Tree.buildTree(nodes);
        inOrderTraversal(root);
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

    static class BinaryTreeClass {
        static int idx = -1;
        public static TreeNode buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.Left = buildTree(nodes);
            newNode.Right = buildTree(nodes);
        
            return newNode;
        }
    }
}

class TreeNode {

    int Data;
    TreeNode Left;
    TreeNode Right;
  
    TreeNode() {
        this.Data = 0;
    }

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
