# [28. Implement strStr()](https://leetcode-cn.com/problems/implement-strstr/)

## 解题思路

若needle为null或空串，返回0；

取两个字符串的长度，遍历haystack字符串，截止到len(h)-len(n),若第一个元素相同，使用subString功能截取haystack字符串，对比是否相同。

**注意**：比较两个值是否相同，用A.equals(B)。