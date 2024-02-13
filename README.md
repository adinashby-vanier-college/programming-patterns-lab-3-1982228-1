[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/e65mUjar)
# Programming Patterns - Lab 3

This template repository is the starter project for Programming Patterns Lab 3. Written in Java, and tested with Gradle/JUnit.

### Question(s)

1. You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

![](Q1_1.jpg)

Input: l1 = [2,4,3], l2 = [5,6,4]  
Output: [7,0,8]  
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]  
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]  
Output: [8,9,9,9,0,0,0,1]

**Constraints**

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

2. Given the head of a linked list, rotate the list to the right by k places.

Example 1:

![](Q2_1.jpg)

Input: head = [1,2,3,4,5], k = 2  
Output: [4,5,1,2,3]

Example 2:

![](Q2_2.jpg)

Input: head = [0,1,2], k = 4  
Output: [2,0,1]

**Constraints**

- The number of nodes in the list is in the range [0, 500].
- 100 <= Node.val <= 100
- 0 <= k <= 2 \* 10 \^ 9

### Setup Command

`gradle clean`

### Run Command

`gradle test`
