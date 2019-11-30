# [17. Letter Combinations of a Phone Number](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/)

## 解题思路1

运用LinkedList链表的特性，**非常巧妙**的解法。

1. Hash Table存储数字和其对应的字符数组。
2. 遍历字符串，获取数字，如果列表数组ls的头部元素（peek()或者element()方法）的长度和数组下标一致，表示还未加入组合数字。例如，digits="23",当ls是a->b->c,i=1时，ls的头部元素a的长度是1，还需要加入3对应的字符数组d,e,f,将头部元素移出(remove()或poll()方法)到临时字符串temp，遍历字符数组d，e，f，temp逐个和他们相加后add到ls数组中。

## 解题思路2

运用递归

