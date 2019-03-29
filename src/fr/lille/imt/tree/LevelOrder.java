package fr.lille.imt.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> solution(TreeNode node){
        List<List<Integer>> resList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> levelList = new ArrayList<>();
            while(levelNum>0){
                TreeNode tmp = queue.poll();
                levelList.add(tmp.val);
                queue.offer(tmp.right);
                queue.offer(tmp.left);
                levelNum--;
            }
            if(levelList!=null)
                resList.add(levelList);
        }
        return resList;
    }
}
