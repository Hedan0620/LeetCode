# [21. Merge Two Sorted Lists](https://leetcode-cn.com/problems/merge-two-sorted-lists/)

## 解题思路1：

常规解题思路，两个列表，把头结点更小的列表作为基列表，遍历另一个列表，在基列表中找到合适的位置，再插入到基列表中。

**注意**：

- 列表为空
- 插入要记录的是前一个列表，。

**缺点**：

- 涉及到多个指针的指向，容易出错。

## 解题思路2：

递归法，非常简洁。当两个列表有一个为空时，返回另一个列表。

比较头结点的大小，递归合并更大头结点的一个列表和该节点.next。

```java
if(l1.val<=l2.val){
    l1.next = mergeTwoLists(l1.next,l2);
    return l1;
}
else {
    l2.next = mergeTwoLists(l1,l2.next);
    return l2;
}
```

