package fr.lille.imt.list;

public class Cycle {

    public static boolean solution(ListNode head){
        ListNode fast = head, slow = head;
        while(slow!=null&&fast!=null){
            slow = slow.next;
            if(fast.next!=null)
                fast = fast.next.next;
            else
                return false;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new CreateList().create();
        System.out.println(solution(head));
    }
}
