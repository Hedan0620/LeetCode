## [11. Container With Most Water](https://leetcode-cn.com/problems/container-with-most-water/)

## 题目

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2. ![img](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg) 

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49. 

**Example:**

```
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
```

## 解题思路

1. 穷举法：时间复杂度O(n^2^），超过leetcode时间限制。

2. 双指针法：设两个指针，分别指向数组的首尾，如果ai小于aj，则指针i向后移动，反之指针j向前移动。如果当前的area大于记录的maxArea,则替换之。

   **原因：**

   如果指针i的长度小于指针j的长度，无论如何移动j，都不可能找到比当前记录的area更大的值了，只能通过移动i来找到新的可能更大的面积。

时间复杂度：O(n)