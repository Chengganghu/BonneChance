package fr.lille.imt.list;

import java.util.Stack;

public class ReverseList {


    public static ListNode solution(ListNode listNode){
        if(listNode == null)
            return listNode;
        Stack<ListNode> stack = new Stack<>();
        while(listNode!=null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        ListNode head = stack.pop();
        ListNode cur = head;
        while(!stack.isEmpty()){
            cur.next = stack.pop();
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    public static ListNode solution2(ListNode listNode){
        if(listNode == null) return listNode;
        if(listNode.next == null) return listNode;
        ListNode next = listNode.next;
        ListNode tmp = solution2(listNode.next);
        next.next = listNode;
        listNode.next = null;
        return tmp;
    }

    public static void main(String[] args) {
        ListNode l1 = new CreateList().create();
        ListNode reversed = solution2(l1);
        while(reversed!=null){
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }


}
