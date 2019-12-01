package easy._021;
class Solution {
     // Definition for singly-linked list.
     public class ListNode {
          int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //用头结点更小的列表作为基础，另一个列表l2用来插入,返回l1
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        ListNode p;
        if(l1.val<=l2.val){
            p = l1;
        }else{
            p = l2;
            l2 = l1;
            l1 = p;
        }
        while(l2!=null){
            //找插入的位置
            while (p!=null && p.next!=null && l2.val>p.next.val)
                p=p.next;
            //l2插到p的后面
            ListNode temp2 = l2;
            l2 = l2.next;

            ListNode temp1 = p.next;
            p.next = temp2;
            temp2.next = temp1;
            p = p.next;

        }
        return l1;
    }
}
