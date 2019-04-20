package fr.lille.imt.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zigzag {
    public List<List<TreeNode>> solution(TreeNode node){
        if(node == null) return null;

        List<List<TreeNode>> resList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        queue.offer(node);
        while(!queue.isEmpty()){
            LinkedList<TreeNode> tmpList = new LinkedList<>();
            if(reverse){
                int levelNodeNum = queue.size();
                while(levelNodeNum>0){
                    TreeNode tmpNode = queue.poll();
                    tmpList.addFirst(tmpNode);
                    if(tmpNode.left!=null) queue.offer(tmpNode.left);
                    if(tmpNode.right!=null) queue.offer(tmpNode.right);
                }
                resList.add(tmpList);
            }else{
                int levelNodeNum = queue.size();
                while(levelNodeNum>0){
                    TreeNode tmpNode = queue.poll();
                    tmpList.add(tmpNode);
                    if(tmpNode.left!=null) queue.offer(tmpNode.left);
                    if(tmpNode.right!=null) queue.offer(tmpNode.right);
                }
                resList.add(tmpList);
            }
        }
        return resList;
    }
}
