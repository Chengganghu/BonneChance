package fr.lille.imt.list;

import java.util.HashMap;
import java.util.Hashtable;

public class LRUCache {
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode before;
        DLinkedNode after;
    }


    private DLinkedNode head,tail;
    private Hashtable<Integer,DLinkedNode> cache = new Hashtable<>();
    private int count;
    private int capacity;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.count = 0;

        head = new DLinkedNode();
        head.before = null;

        tail = new DLinkedNode();
        tail.after = null;

        head.after = tail;
        tail.before = head;
    }


    /**
     * 在头节点的后面添加节点
     * @param node
     */
    private void addNode(DLinkedNode node){
        node.before = head;
        node.after = head.after;

        head.after.before = node;
        head.after = node;
    }

    /**
     * 删除任意的一个节点
     * @param node
     */
    private void removeNode(DLinkedNode node){
        DLinkedNode after = node.after;
        DLinkedNode before = node.before;

        after.before = before;
        before.after = after;
    }

    /**
     * 将节点移动至头节点的后面
     * @param node
     */
    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    /**
     * 移除尾节点
     * @return
     */
    private DLinkedNode popTail(){
        DLinkedNode res = tail.before;
        this.removeNode(res);
        return res;
    }

    /**
     * 获取一个节点，并将该节点移动至头节点的后面
     * @param key
     * @return
     */
    public int get(int key){
        DLinkedNode node = cache.get(key);
        if(node == null){
            throw new RuntimeException("does not exist");
        }
        this.moveToHead(node);
        return node.value;
    }

    public void put(int key,int value){
        DLinkedNode node = cache.get(key);

        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key,newNode);
            this.addNode(newNode);

            ++count;

            if(count > capacity){
                DLinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                count--;
            }
        }else{
            node.value = value;
            this.moveToHead(node);
        }
    }

}
