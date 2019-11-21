package medium._002;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode t = node;
        int temp=0;//进位
        while(l1!=null || l2!=null){
            temp = temp / 10; //temp 记录的是进位
            if(l1 !=null){
                temp = temp + l1.val;
                l1 = l1.next;
            }
            if(l2 !=null){
                temp = temp + l2.val;
                l2 = l2.next;
            }
            t.next = new ListNode(temp%10); //相加个位数
            t = t.next;
        }
        //考虑末尾的进位
        if(temp/10!=0){
            t.next = new ListNode(temp/10);
        }
        return node.next;
    }
}
