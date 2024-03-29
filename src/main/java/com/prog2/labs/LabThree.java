package com.prog2.labs;
import java.util.LinkedList;

/**
 * @author adinashby
 *
 */
public class LabThree {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        ListNode copyHead = new ListNode(0);
        ListNode currentNode = copyHead;
        int carry = 0; 

        while (firstList != null || secondList != null || carry != 0) {
            int sum = carry;
            if (firstList != null) {
                sum += firstList.val;
                firstList = firstList.next;
            }
            if (secondList != null) {
                sum += secondList.val;
                secondList = secondList.next;
            }

            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }

        return copyHead.next;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode current = head;
        int len = 1;

        while (current.next != null) {
            current = current.next;
            len++;
        }

        current.next = head;

        ListNode newTail = head;

        for (int i = 0; i < len - k % len - 1; i++) {
            newTail = newTail.next;

        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
