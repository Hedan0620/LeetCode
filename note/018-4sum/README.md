# [18. 4Sum](https://leetcode-cn.com/problems/4sum/)

## 解题思路

1. 对数组排序；
2. 建立两重for循环和双指针，第一个for，i从0遍历到nums.length-3,第2个for，j从i+1遍历到nums.length-2。双指针分别是j+1和num.length-1,和3sum的做法相同，往中间靠拢。
3. 为避免重复，第一个for循环，如果num[i]\==num[i-1]，则结束i的查找；第二个循环，若num[i]\==num[i-1],也结束当前j的查找。
4. 时间复杂度是O(n^2^log~2~n)。