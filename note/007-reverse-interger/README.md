# [7. Reverse Integer](https://leetcode-cn.com/problems/reverse-integer/)

## 题目

Given a 32-bit signed integer, reverse digits of an integer.

**Example:**

```
Input: 123
Output: 321
```

```
Input: -123
Output: -321
```

```
Input: 120
Output: 21
```

**Note:**
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## 解题思路1

1. 对整数x对10取余，获得最后一位数字，x再整除10，去掉最后一位数字，直到x=0；
2. 对剥离出的最后一位数字进行处理：原来的数乘以10再加上新的数字；

## 解题思路2

1. 将int整数转化为String，再转化为char[]数组，将数组内容进行反转，再转化成long型整数。