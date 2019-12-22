package hard._025;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head ==null)
            return null;
        //寻找区间[start,end)中k个待反转元素
        ListNode start,end;
        start = head;
        end = head;
        for(int i=0;i<k;i++){
            if(end==null)//当前元素个数小于k个，跳出
                return head;
            end = end.next;
        }
        ListNode newHead = reverse(start,end);
        start.next = reverseKGroup(end,k);
        return newHead;

    }
    //左闭右开，[start,end)
    public ListNode reverse(ListNode start, ListNode end){
        ListNode pre,cur,next;
        pre = null;
        cur = start;
        next = start;
        while (cur!=end){
            next = cur.next;
            cur.next = pre;
            //更新指针
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
