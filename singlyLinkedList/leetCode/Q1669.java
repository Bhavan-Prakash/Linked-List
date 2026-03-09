//1669. Merge In Between Linked Lists


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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int to_insert = 0;

        ListNode temp = list1;

        while(temp != null){
            if(to_insert == a-1){
                temp.next = list2;
            }
        }

    }
}