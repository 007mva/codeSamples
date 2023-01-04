/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

  public ListNode reverseList(ListNode head) {
          if(head==null) return null;

          ListNode curr=head;
          ListNode next=null;
          ListNode prev=null;
          while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
          }

      return prev;
    }