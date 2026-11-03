class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode currE = head;

        while (currE != null) {

            ListNode next = currE.next;

            currE.next = prev;

            prev = currE;
            currE = next;
        }

        return prev;
    }
}