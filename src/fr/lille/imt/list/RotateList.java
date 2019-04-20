package fr.lille.imt.list;

public class RotateList {
    public static ListNode solution(ListNode head, int k){
        if(k<0)
            throw new IllegalArgumentException("k must bigger then 0");
        if(head == null) return head;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        int length = 0;
        while(dummyHead.next!=null){
            dummyHead = dummyHead.next;
            length++;
        }
        k = k%length;
        ListNode fast=head ,slow=head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        ListNode tmp = slow.next;
        slow.next = null;
        return tmp;

    }
}
