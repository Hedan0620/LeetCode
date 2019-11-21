# [1. Two Sum](https://leetcode.com/problems/two-sum/)

## 题目

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

```text
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```



## 解题思路1

两重for循环，测试和是否为target。

时间复杂度是O(n^2^)。



## 解题思路2

```math
target = a + b
```

看成是

```math
b = target - a
```



用HashMap存储，`key：b，value：a的下标`，只需一层for循环。

遍历数组，如果在map里面，则找到了，反之，将该值要寻找的value和它的下标存到map。

时间复杂度是O(n)。





