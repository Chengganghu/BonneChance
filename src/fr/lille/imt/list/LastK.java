package fr.lille.imt.list;

public class LastK {
    public static ListNode solution(ListNode listNode,int k){
        if(listNode == null)
            return null;
        int i = 0;
        ListNode cur = listNode;
        while(i < k ){
            if(cur == null)
                throw new RuntimeException("this list doesnt have K node");
            cur = cur.next;
            i++;
        }
        ListNode before = listNode;
        while(cur!=null){
            cur = cur.next;
            before = before.next;
        }
        return before;

    }

    public static void main(String[] args) {
        ListNode l1 = new CreateList().create();
        System.out.println(solution(l1,3).val);
    }
}
