# [14. Longest Common Prefix](https://leetcode-cn.com/problems/longest-common-prefix/)

## 解题思路

- 将第一个字符串作为模板，后面的字符串逐个与之对比，若不同，则跳出循环；
- 注意字符串的下标，容易出现下标超出范围；传空字符串组时，没有第一个字符串。
- 时间复杂度是O(n),n是字符串的长度。

