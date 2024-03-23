import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    private TreeNode root;
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }
    public void preOrderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    public void iterativePreOrderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Stack<TreeNode>stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
           TreeNode temp=stack.pop();
           System.out.print(temp.data+" ");
           if(temp.right!=null)
           {
               stack.push(temp.right);
           }
           if(temp.left!=null)
           {
               stack.push(temp.left);
           }
        }
    }
    public void inorderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    public void iterativeInorderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Stack<TreeNode>stack=new Stack<>();
        TreeNode temp=root;
        while(!stack.isEmpty()||temp!=null)
        {
            if(temp!=null)
            {
                stack.push(temp);
                temp=temp.left;
            }
            else
            {
                temp=stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
    public void postorderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public void leveorderTraversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            {
                queue.offer(temp.left);
            }
            if(temp.right!=null)
            {
                queue.offer(temp.right);
            }
        }
    }
    public static void main(String[] args) {

        Main main=new Main();
        main.createBinaryTree();
        main.preOrderTraversal(main.root);
        System.out.println();
        main.iterativePreOrderTraversal(main.root);
        System.out.println();
        main.inorderTraversal(main.root);
        System.out.println();
        main.iterativeInorderTraversal(main.root);
        System.out.println();
        main.postorderTraversal(main.root);
        System.out.println();
        main.leveorderTraversal(main.root);
    }
}