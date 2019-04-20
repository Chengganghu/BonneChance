package fr.lille.imt.tree;

public class TreeNode implements Comparable<TreeNode>{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
    @Override
    public String toString(){
        return "val: "+val;
    }

    @Override
    public int compareTo(TreeNode o) {
        if(this.val > o.val)
            return 1;
        else if(this.val<o.val)
            return -1;
        else return 0;
    }
}
