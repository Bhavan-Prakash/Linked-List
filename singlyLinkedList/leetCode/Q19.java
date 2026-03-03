//Q19 : Remove Nth Node From End of List



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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }else{
            int size = 0;
            ListNode temp = head;
            while(temp!=null){
                size++;
                temp = temp.next;
            }

            if(size==1){
                return null;
            }else if(n == size){
                //removing first node
                return head.next;
            }else{
                int remove_index = size - n;
                ListNode temp2 = head;

                for(int i =1; i<=remove_index; i++){
                    if(i == remove_index){
                        temp2.next = temp2.next.next;
                    }
                    temp2 = temp2.next;
                }


                System.out.println(size);
                return head;
            }

        }

    }
}