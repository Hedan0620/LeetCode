# [6. ZigZag Conversion](https://leetcode-cn.com/problems/zigzag-conversion/)

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```


And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
**Example 1:**

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```


**Example 2:**

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

```
P     I    N
A   L S  I G
Y A   H R
P     I
```

## 解题思路

1. 找规律，以例2详解：

   * P—>I—>N是下标连加6；
   * A—>L—>S—>I—>G是下标连加4,2,4,2...
   * Y—>A—>H—>R是下标连加2,4,2,4...
   * P—>I是连加6；

   可以发现第一行和最后一行连续加`TotalJump=（numRows-1）x2`，中间行（第i行）连续加`OneJump=TotalJump- i x 2`和`OneJump=TotalJump-OneJump`。

1. 时间复杂度是O(n)。

##### 注意的点：

numRows=1时，如果按上面的步骤，TotalJump=0会陷入死循环，故要单独处理，直接返回s；