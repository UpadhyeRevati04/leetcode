/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> st = new HashSet<>();
        while(head != null){
            if(st.contains(head)){
                return true;
            }
            st.add(head);
            head = head.next;
        }
        return false;
    }
}