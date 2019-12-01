package hard._023;


import java.util.List;

class Solution {

//Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ls = new ListNode(0);
        if(lists.length==0) return null;
        else if(lists.length==1) return lists[0];
        else{
            for(int i=0;i<lists.length-1;i++){
                lists[i+1] = mergeLists(lists[i],lists[i+1]);
            }
            return lists[lists.length-1];
            //lists[i]和list[i+1]合并到list[i+1],递归list[1:]
        }
    }
    public ListNode mergeLists(ListNode l1,ListNode l2){
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        else if(l1.val<=l2.val){
            l1.next = mergeLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeLists(l1,l2.next);
            return l2;
        }
    }
}
