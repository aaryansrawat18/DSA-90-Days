/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findmid(ListNode head){
        
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public ListNode mearge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(-1);
        ListNode tmp=dummy;
        while(left !=null && right !=null){
            if(left.val<=right.val){
                tmp.next=left;
                left=left.next;
            }
            else{
                tmp.next=right;
                right=right.next;
            }
            tmp=tmp.next;
           
        }
         while(left!=null){
                tmp.next=left;
                left=left.next;
                tmp=tmp.next;
            }
             while(right!=null){
                tmp.next=right;
                right=right.next;
                tmp=tmp.next;
            }
            return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        
        left=sortList(left);
        right=sortList(right);
        return mearge(left,right);
    }
}