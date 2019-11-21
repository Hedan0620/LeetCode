##[3. Longest Substring Without Repeating Characters](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

## 题目

Given a string, find the length of the longest substring without repeating characters.

**Example 1:**

```text
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:
```

**Example 2:**

```text
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**

```text
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## 解题思路

两重for循环，对每个下标作为起点，找出其子串的长度len，比较最长的子串。

查找字符是否重复：用HashMap存储子串，`key：字符，value：1`。

**注意**：

1. 遍历子串时，若找到重复的字符，map需要置空，maxlen更新。
2. 子串遍历到最后一个元素时，map置空，maxlen更新。