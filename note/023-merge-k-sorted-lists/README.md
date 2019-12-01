# [23. Merge k Sorted Lists](https://leetcode-cn.com/problems/merge-k-sorted-lists/)

## 解题思路

借鉴21题的解题思路，合并多个列表可以两两合并，直到合成最后一个列表。

两个表合并的时间复杂度是O(2n)，n是列表的节点个数，m是列表的长度。

两表合并一共要进行m-1次，而且表的长度是呈倍数增长的。

推导公式：n（1+2+...+m)。

时间复杂度是O(m^2^n)。