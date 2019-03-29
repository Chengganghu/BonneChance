package fr.lille.imt.tree;

import java.util.*;

public class Tree {
    public void visit(TreeNode node){
        System.out.print(node.val+" ");
    }

    /**
     * 递归先序遍历
     */
    public void preOrderRecursion(TreeNode node){
        if(node == null) return;
        visit(node);
        preOrderRecursion(node.left);
        preOrderRecursion(node.right);
    }

    public List<TreeNode> preOrderTraversal(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        Stack<TreeNode> stack  = new Stack<>();
        if(root == null) return list;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode tmp = stack.pop();
            if(tmp != null){
                list.add(tmp);
                stack.push(tmp.right);
                stack.push(tmp.left);
            }
        }
        return list;
    }

    /**
     * 递归中序遍历
     */
    public void midOrderRecursion(TreeNode node){
        if(node == null) return;
        midOrderRecursion(node.left);
        visit(node);
        midOrderRecursion(node.right);
    }

    public List<TreeNode> midOrderTraversal(TreeNode node){
        List<TreeNode> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = node;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur);
            cur = cur.right;
        }
        return list;
    }

    /**
     * 后序遍历
     * 先序遍历后反置数组
     */

    /**
     * 层序遍历
     */
    public List<List<TreeNode>> levelorder(TreeNode node){
        List<List<TreeNode>> resList = new ArrayList<>();
        int levelNum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            levelNum = queue.size();
            List<TreeNode> levelList = new ArrayList<>();
            while(levelNum >0 ){
                TreeNode treeNode = queue.poll();
                if(treeNode!=null){
                    levelList.add(treeNode);
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
                levelNum--;
            }
            if(levelList.size()>0){
                resList.add(levelList);
            }
        }
        return resList;

    }
}


