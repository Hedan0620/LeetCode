# [19. Remove Nth Node From End of List](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)

## 解题思路

移除倒数第N个节点，设置两个指针front和pre，front在pre的前面N步，再两个指针同步移动，当front指向的节点.next为null时，表明pre指向的下一个节点是要删除的节点。

### 动画描述

![img](https://pic.leetcode-cn.com/cc43daa8cbb755373ce4c5cd10c44066dc770a34a6d2913a52f8047cbf5e6e56-file_1559548337458)

要注意front先走前N步结束后，若已经到了null节点，则说明要删除的节点是头结点head，直接return head.next。