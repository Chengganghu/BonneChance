package fr.lille.imt.tree;

public class LCA {

    public static TreeNode solution(TreeNode root,TreeNode p,TreeNode q){
        recurse(root,p,q);
        return ans;
    }
    private static TreeNode ans = null;
    public static boolean recurse(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) return false;
        int left = recurse(root.left,p,q)?1:0;
        int right = recurse(root.right,p,q)?1:0;
        int mid = (root == p||root == q)?1:0;

        if(left+right+mid == 2)
            ans = root;

        return left+right+mid >0 ? true:false;
    }

    public static void main(String[] args) {
        TreeNode root = CreateTree.create();
        System.out.println(solution(root,CreateTree.t3,CreateTree.t5));
    }

}
