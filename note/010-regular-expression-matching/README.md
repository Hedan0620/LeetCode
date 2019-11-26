## [10. Regular Expression Matching](https://leetcode-cn.com/problems/regular-expression-matching/)

## 题目

Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

Note:

s could be empty and contains only lowercase letters a-z.
p could be empty and contains only lowercase letters a-z, and characters like . or *.
**Example 1:**

```
Input:
s = "aa"
p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
```

**Example 2:**

```
Input:
s = "aa"
p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
```

**Example 3:**

```
Input:
s = "ab"
p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
```

**Example 4:**

```
Input:
s = "aab"
p = "c*a*b"
Output: true
Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
```

**Example 5:**

```
Input:
s = "mississippi"
p = "mis*is*p*."
Output: false
```

## 解题思路1：

##### 递归法：

减少字符串的规模，问题性质一样，故可以使用递归处理。

递归的情况：（用模式串p作为判断条件）

1. p是空串：若s是空串，匹配成功，反之，匹配失败；

   ```java
   if(p.isEmpty())
   	return s.isEmpty();
   ```

   

![image-20191126170636714](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191126170636714.png)

2. p的第二个字母是\*，星号表示0个**或者**多个前面的元素，因此要用**或**语句。

   ```java
   if(p.length()>=2 && p.charAt(1)=='*')
       return isMatch(s,p.subString(2) || (!s.isEmpty && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.')) && isMatch(s.subString(1),p) )
   ```
##### \*匹配0字符：
   
![image-20191126170650276](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191126170650276.png)
   
   ##### \*匹配多个字符：

![image-20191126170700854](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191126170700854.png)

3. p第一个是\.元素或者p和s的首元素相同，递归调用两个去掉第一个元素的子串。

   ```java
   if(!s.isEmpty && (p.charAt(0)=='.' || p.charAt(0)==s.charAt(0)))
       return isMatch(s.subString(1),p.subString(1))
   ```

   

![image-20191126170824885](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191126170824885.png)

4. 其余情况，返回false；

##### 注意：第二个星号的判断必须在第三个if判断之前，或者两个是if-else的关系。

