# [22. Generate Parentheses](https://leetcode-cn.com/problems/generate-parentheses/)

## 解题思路

回溯法：如果还剩一个位置，可以放置'('或')'。

如果'('的数量不超过n，可以放左括号，如果'('的数量大于')'的数量，可以放')',剩下的继续回溯，直到左右括号的总个数等于n*2，此时将字符串加入到list中，结束。