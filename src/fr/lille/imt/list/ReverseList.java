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
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;
        ListNode reversed = solution2(l1);
        while(reversed!=null){
            System.out.println(reversed.val);
            reversed = reversed.next;
        }
    }


}
