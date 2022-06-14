class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;


    TreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
class Tree_Col {
    TreeNode topRoot;

    Tree_Col(){
        topRoot = null;
    }


    void preOrder(TreeNode root)
    {
        if(root != null)
        {
            System.out.print(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(TreeNode root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(" " + root.data);
            inOrder(root.right);
        }
    }
    void postOrder(TreeNode root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.data);
        }
    }

    public static void main (String [] args)
    {
        Tree_Col tem = new Tree_Col();
        tem.topRoot = new TreeNode(2);
        tem.topRoot.left = new TreeNode(0);
        tem.topRoot.left.left = new TreeNode(7);
        tem.topRoot.left.left.left = new TreeNode(6);
        tem.topRoot.left.left.right = new TreeNode(5);
        tem.topRoot.right = new TreeNode(3);
        tem.topRoot.right.left = new TreeNode(1);
        tem.topRoot.right.left.left = new TreeNode(8);
        tem.topRoot.right.right = new TreeNode(9);
        tem.topRoot.right.right.right = new TreeNode(4);

        tem.preOrder(tem.topRoot);
        System.out.println();
        tem.inOrder(tem.topRoot);
        System.out.println();
        tem.postOrder(tem.topRoot);

    }

}
