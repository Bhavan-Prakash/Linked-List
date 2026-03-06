//Q143. Reorder List



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
    public void reorderList(ListNode head) {
        if(head == null){

        }else{


            // System.out.println(size);
            // System.out.println(head.val);

            int size = 0;
            ListNode temp2 = head;
            ListNode curr = head;
            ListNode previous = null;
            while(curr != null){
                ListNode next = curr.next;
                curr.next = previous;
                previous = curr;
                curr = next;


                size++;
            }
            temp2 = previous;



            ListNode result = head;

            for(int i = 1; i <= size && result != null && temp2 != null; i++){
                if(i % 2 == 0){
                    result.next = temp2;
                    temp2 = temp2.next;
                }
                result = result.next;
            }

            // for(int i = 1; i <= size && temp2 != null&& result != null; i++){
            //     if(i % 2 == 0){
            //         result.next = temp2;
            //         temp2 = temp2.next;
            //     }

            //     result = result.next;
            // }


            if(result != null){
                System.out.println(result.next.val);
            }

        }
    }
}