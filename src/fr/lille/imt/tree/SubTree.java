package fr.lille.imt.tree;

public class SubTree {
    public static void main(String[] args) {
        System.out.println(hasSubTree(CreateTree.create(),CreateTree.t5));

    }

    public static boolean hasSubTree(TreeNode a,TreeNode b){
        if(b == null)
            return true;
        else if(a == null)
            return false;
        else{
            if(a.val == b.val)
                return isSubTree(a,b);
            else{
                return hasSubTree(a.left,b)||hasSubTree(a.right,b);
            }
        }
    }
    public static boolean isSubTree(TreeNode a, TreeNode b){
        if(b == null) return true;
        else if(a == null) return false;
        else{
            if(a.val == b.val){
                return isSubTree(a.left,b.left) && isSubTree(a.right,b.right);
            }else{
                return false;
            }
        }
    }

}
