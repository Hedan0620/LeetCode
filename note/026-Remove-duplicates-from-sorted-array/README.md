# [26. Remove Duplicates from Sorted Array](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/)

## 解题思路

空间复杂度是O(1),需要利用原来的数组。

定义一个起始的数组下标，将不重复的元素复制到下标所在处，下标+1，直到遍历完所有元素。