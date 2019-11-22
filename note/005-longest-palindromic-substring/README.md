# [5. Longest Palindromic Substring](https://leetcode-cn.com/problems/longest-palindromic-substring/)

## 题目

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

**Example 1:**

```
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```


**Example 2:**

```
Input: "cbbd"
Output: "bb"
```

##  解题思路

1. 两重for循环，外层for以该元素为起点，内层for查找后面和起点相同的元素，找到了则将该下标作为终点，判断之间的元素是否对称；
2. 需要单独写一个函数判断起点和终点之间元素是否对称。
3. 时间复杂度是O(n^2^)

##### 要注意的点:

​	1.字符串为空，或者长度为1，直接返回字符串本身；

​	2.整个字符串没有重复的字母，将任意一个字符转化为字符串(我的代码是第一个字符)，并返回。

##### 扩展：java中char和String的相互转化

###### String转化为char

1. 使用`String.charAt(index)`,返回下标为`index`的元素；
2. 使用`String.toCharArray()`,将整个String转化为char[]返回；

###### char转化为String

```java
1.String s = String.valueOf('c');//效率最高的方法

2.String s = String.valueOf(new char[]{'c'});//将一个char数组转换成String

3.String s = Character.toString('c');
//Character.toString(char)方法实际上是直接返回String.valueOf(char)

4.String s = new Character('c').toString;

5.String s = "" + 'c';
//看起来简单，但是效率最低
//Java中的String Object的值实际上是不可变的，是一个final的变量。
//所以我们每次对String作出改变，都是初始化一个全新的String Object，并将原来的变量指向了这个新的String
//字符串直接相加实际上调用了如下的方法：
//new StringBuilder().append("").append('c').toString()
6.String s = new String(new char[]{'c'});
```

