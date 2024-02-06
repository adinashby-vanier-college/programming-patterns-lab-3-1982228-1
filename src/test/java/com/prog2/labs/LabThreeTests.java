package com.prog2.labs;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabThreeTests {

	@Test
	void addTwoNumbersTest1() {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		
		int[] result = { 7, 0, 8 };

		ListNode actual = LabThree.addTwoNumbers(list1, list2);
		
		int[] actualArray = new int[3];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
	@Test
	void addTwoNumbersTest2() {
		ListNode list1 = new ListNode(9);
		list1.next = new ListNode(9);
		list1.next.next = new ListNode(9);
		list1.next.next.next = new ListNode(9);
		list1.next.next.next.next = new ListNode(9);
		list1.next.next.next.next.next = new ListNode(9);
		list1.next.next.next.next.next.next = new ListNode(9);
		
		ListNode list2 = new ListNode(9);
		list2.next = new ListNode(9);
		list2.next.next = new ListNode(9);
		list2.next.next.next = new ListNode(9);
		
		int[] result = { 8, 9, 9, 9, 0, 0, 0, 1 };

		ListNode actual = LabThree.addTwoNumbers(list1, list2);
		
		int[] actualArray = new int[8];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
	@Test
	void rotateRightTest1() {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);
		
		int[] result = { 4, 5, 1, 2, 3 };

		ListNode actual = LabThree.rotateRight(list1, 2);
		
		int[] actualArray = new int[5];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	
	@Test
	void rotateRightTest2() {
		ListNode list1 = new ListNode(0);
		list1.next = new ListNode(1);
		list1.next.next = new ListNode(2);
		
		int[] result = { 2, 0, 1 };

		ListNode actual = LabThree.rotateRight(list1, 4);
		
		int[] actualArray = new int[3];
		int i = 0;
		
		while(actual != null) {
			actualArray[i] = actual.val;
			++i;
			actual = actual.next;
		}

		assertArrayEquals(result, actualArray);
	}
	


}
