# [2. Add Two Numbers](https://leetcode-cn.com/problems/add-two-numbers/)

## 题目

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

```math
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

## 解题思路

新建一个链表存储和，遍历两个链表，求和，直到两个链表都到末尾。

**注意：**

1. 按位相加，需要处理进位问题；
2. 相加的两个链表长度不一定相同，因此需要判断各链表是否到达末尾；
3. 根据节点的结构，要生成下一个节点存储数据。首节点的数据无效，返回第二个节点的链表；
4. 结束循环后，末尾相加的进位需要处理；