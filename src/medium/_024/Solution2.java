package medium._024;

public class Solution2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    // 非递归解法
    public ListNode swapPairs(ListNode head){
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next!=null && cur.next.next!=null){
            ListNode l1 = cur.next;
            ListNode l2 = l1.next;
            ListNode l3 = l2.next;
            cur.next = l2;
            l2.next = l1;
            l1.next = l3;
            cur = l1;
        }
        return pre.next;
    }
}
