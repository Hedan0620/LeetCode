## [8. String to Integer (atoi)](https://leetcode-cn.com/problems/string-to-integer-atoi/)

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

**Note:**

Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
**Example 1:**

```
Input: "42"
Output: 42
```

**Example 2:**

```
Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.
```

**Example 3:**

```
Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
```

**Example 4:**

```
Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.
```

**Example 5:**

```
Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.
```

## 解题思路：

1. 把String转换成char[]查找里面的数字；
2. 单独处理str为空串和null的情况；

但是代码太多if-else，可读性差，改进版本Solution2.java

##### 区分空串和null：

1. 空串：

```java
String str = "";
if(str.length==0);//长度为0
if(str.equals(""));//内容为空
```

2. null是空指针，表示没有任何对象与该变量关联，检查一个字符串是否为null的方法：

```java
if(str == null);
```

3. 检查一个字符串既不是null串也不是空串：

```java
if(str!=null && str.length()!=0);
```

**注意:**要先检查是否为null，否则调用length方法会报错。

4. 使用StringUtils工具类,判断不是null也不是空串，如下：

```java
if(StringUtils.isNotBlank(str));
```

