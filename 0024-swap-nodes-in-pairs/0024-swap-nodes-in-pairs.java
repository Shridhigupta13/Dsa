class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next != null && temp.next.next != null){
            ListNode i = temp.next;
            ListNode j = temp.next.next;

            i.next = j.next;
            j.next = i;
            temp.next = j;

            temp = i;
        }
        return dummy.next;
    }
}