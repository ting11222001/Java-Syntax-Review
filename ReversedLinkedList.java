/*
 * https://www.youtube.com/watch?v=G0_I-ZF0S38&ab_channel=NeetCode
 * https://leetcode.com/problems/reverse-linked-list/submissions/1241426124/
 */

import java.util.*;

// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class ReversedLinkedList {
  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    ListNode nextCurr = null; // current node's next

    while (curr != null) {
      nextCurr = curr.next; // save this original next value somewhere
      curr.next = prev;
      prev = curr;
      curr = nextCurr;
    }

    return prev;
  }
}
