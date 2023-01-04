/*

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. 
The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

*/
 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode fakeHead=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                fakeHead.next=l1;
                l1=l1.next;
            }
            else{
                fakeHead.next=l2;
                l2=l2.next;
            }
            fakeHead=fakeHead.next;
        }
        fakeHead.next= l2==null ? l1:l2;
        return dummy.next;


    }