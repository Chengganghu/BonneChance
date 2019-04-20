package fr.lille.imt.tree;

public class CreateTree {
    public static TreeNode t1 = new TreeNode(1);
    public static TreeNode t2 = new TreeNode(2);
    public static TreeNode t3 = new TreeNode(3);
    public static TreeNode t4 = new TreeNode(4);
    public static TreeNode t5 = new TreeNode(5);
    public static TreeNode t6 = new TreeNode(6);
    public static TreeNode t7 = new TreeNode(7);
    public static TreeNode t8 = new TreeNode(8);


    public static TreeNode create(){
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t8;
        t5.left = t6;
        t5.right = t7;

        return t1;
    }
}
