# [25. Reverse Nodes in k-Group](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/)

## 解题思路

同24题思路一样，这道题也可以用递归思路解题。

1. 先反转以head为开头的k个元素 。![img](https://pic.leetcode-cn.com/70103036cd16e6ddef82ea1975a0a761e218bb997ccd9039f13f6e9ee68d9b8b-file_1573146650856) 

2.将k+1个元素作为head递归调用reverseKGroup函数。 ![img](https://pic.leetcode-cn.com/8ee2f96e12adeef2e7e6b6fc4b809dd9ec32efffcc2bb4ad5983de513aade878-file_1573146650860) 

3. 将上面两个过程连接起来。![img](https://pic.leetcode-cn.com/6a3d88e959d5056f7b3391b2e16a00bc65f157c98720cd5deb7da0904021d74c-file_1573146650861) 

递归出口：head为空，或当前元素个数不足k个。

节点反转： ![img](https://pic.leetcode-cn.com/957560590b4a0a0d040dad0d1e5fd9c1cb438b8c0ecad9d048508e62bbfda883-file_1573146650877) 

