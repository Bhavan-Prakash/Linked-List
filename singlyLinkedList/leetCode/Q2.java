//Q2 : Add Two Numbers

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String l1_num = "";
        String l2_num = "";

        while(l1 != null){
            l1_num = l1_num+Integer.toString(l1.val);
            l1 = l1.next;

        }

        while(l2 != null){
            l2_num = l2_num+Integer.toString(l2.val);
            l2 = l2.next;

        }


        int num_1 = Integer.valueOf(l1_num);
        int num_2 = Integer.valueOf(l2_num);
        int sum = num_1+num_2;

        String sum_str = Integer.toString(sum);

        ListNode l3 = new ListNode(sum_str.charAt(sum_str.length()-1) - '0');
        ListNode current = l3;

        for(int i = sum_str.length()-2; i >= 0; i--){
            current.next = new ListNode(sum_str.charAt(i) - '0');
            current = current.next;
        }


        return l3;

    }
}