package fr.lille.imt.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zigzag {
    public List<List<Integer>> solution(TreeNode node){
        if(node == null) return null;

        List<List<Integer>> resList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(node);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> levelList = new ArrayList<>();

            while(levelNum>0){
                if(reverse){
                    TreeNode tmp = queue.poll();
                    levelList.add(tmp.val);
                    queue.offer(tmp.right);
                    queue.offer(tmp.left);
                }else{
                    TreeNode tmp = queue.poll();
                    levelList.add(tmp.val);
                    queue.offer(tmp.left);
                    queue.offer(tmp.right);
                }
            }
            if(levelList!=null){
                reverse = !reverse;
                resList.add(levelList);
            }
        }
        return resList;
    }
}
