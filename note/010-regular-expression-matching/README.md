# [10. Regular Expression Matching](https://leetcode-cn.com/problems/regular-expression-matching/)

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

## 解题思路1：递归法

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

## 解题思路2：动态规划法

根据动态规划的标准流程解题。

* 状态定义：

  * 设动态规划网格dp，dp\[i][j]表示s的前i个元素和p的前j个元素是否匹配，值为true或false。
  * 记s和p的长度分别为sSize和pSize。
  * dp的大小为sSize+1，pSize+1。下标最大为dp\[sSize][pSize]表示s的前sSize个元素和p的前pSize个元素是否匹配。

* 初始状态：

  * dp所有元素先初始化为false。

  * dp\[0][0]=true

  * dp第一行，表示当s为空时，p何时与s匹配：

    * 只有当p为“c\*c\*c\*”时，c表示任意字符，若当前元素为\*，\*前面的元素0个，则p的前j+1个元素能否和空串匹配，取决于前j-1个元素能否和空串匹配。

    ```java
  j:1->pSize
    if(dp[0][j]=='*')
    	dp[0][j+1] = dp[i][j-1];
    ```
  
* 转移方程：

  * 当s[i]和p[j]匹配时：

  * ```java
    if(s[i]==p[j] || p[j]=='.')
    	dp[i+1][j+1] = dp[i][j];
    ```
    
  * 反之，
  
    * 当p[j] == '*'时：
      * 若s[i]和p[j-1]不匹配，令下标为j-1的元素取0个，即“x*”表示为“”，dp\[i+1][j+1] =dp\[i+1][j-1]。
      *  反之，“x*”可以有三种可能“”，“x”，“xx..”，因此dp\[i+1][j+1] = dp\[i+1][j-1] || dp\[i+1][j] || dp\[i][j+1]。
  
  * 返回值：
  
    * dp\[sSize][pSize]：表示s的前sSize个元素和p的前pSize个元素是否匹配。