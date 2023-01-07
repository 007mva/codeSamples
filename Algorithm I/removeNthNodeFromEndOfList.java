/*

Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

 public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;

    while(n>=0){
        first=first.next;
        n--;
    }
    
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}