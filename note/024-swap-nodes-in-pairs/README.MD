# [24. Swap Nodes in Pairs](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)

## 解题思路

链表节点两两交换：

1. 递归法

  ![image-20191222115900647](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191222115900647.png)

   先对head和next进行调换，后用递归调换；
  
  递归出口是：head为空或者head.next为空。
  
  2.非递归法
  
  新建立一个节点pre，cur作为遍历节点，指向pre，指向head，调换后head与next之后，cur往后移动两个节点，直到cur.next或cur.next.next为空。
  
  ![image-20191222121903657](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191222121903657.png)
  
  最后返回pre.next。
  
  
  
  