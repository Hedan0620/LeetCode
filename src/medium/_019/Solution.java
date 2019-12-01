package medium._019;

//Definition for singly-linked list.

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head;
        ListNode pre=head;
        int i = 0;
        while (i<n){
            front=front.next;
            i++;
        }
        if(front==null)//表示删除头结点
            return head.next;
        while(front.next!=null){
            front=front.next;
            pre=pre.next;
        }
        //此时front指向末尾，pre是要找的倒数第n个节点的前一个节点
        pre.next = pre.next.next;
        return head;
    }
}
