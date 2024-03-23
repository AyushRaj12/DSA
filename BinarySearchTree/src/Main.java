import com.sun.source.tree.Tree;

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
    public void insert(int value)
    {
        root=insert(root,value);
    }
    public TreeNode insert(TreeNode root,int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
            return root;
        }
        if(value< root.data)
        {
            root.left=insert(root.left,value);
        }
        else {
            root.right=insert(root.right,value);
        }
        return root;
    }
    public TreeNode searchKey(int key)
    {
        return searchKey(root,key);
    }
    public TreeNode searchKey(TreeNode root,int value)
    {
        if(root==null||root.data==value)
        {
            return root;
        }
        if(value< root.data)
        {
            return searchKey(root.left,value);
        }
        else
        {
            return searchKey(root.right,value);
        }
    }
    public boolean validBst(long min,long max)
    {
        return validBst(root,min,max);
    }
    public boolean validBst(TreeNode root,long min,long max)
    {
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max)
        {
            return false;
        }
        boolean left=validBst(root.left,min,root.data);
        if(left)
        {
            boolean right=validBst(root.right,root.data,max);
            return right;
        }
        return false;
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
    public static void main(String[] args) {
        Main main=new Main();
        main.insert(10);
        main.insert(5);
        main.insert(11);
        main.insert(7);
        main.insert(9);
        main.insert(4);
        main.insert(8);
        main.insert(3);
        main.preOrderTraversal(main.root);
        //System.out.print(main.searchKey(3));
        TreeNode temp=main.searchKey(3);
        if(temp!=null)
        {
            System.out.print("present");
        }
        else
        {
            System.out.print("Absent");
        }
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;
        if(main.validBst(min,max))
        {
            System.out.print("correct");
        }
        else
        {
            System.out.print("wrong");
        }

    }
}