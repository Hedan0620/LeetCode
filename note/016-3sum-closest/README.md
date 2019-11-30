# [16. 3Sum Closest](https://leetcode-cn.com/problems/3sum-closest/)

## 解题思路

和15题一样，先对数组进行排序，假设最接近的和是前面三个元素的和，遍历一遍数组，设双指针， 一个指向该数组后一位，另一个指向数组最后一个元素。将三个元素相加的和sum，与最接近的和closest_sum，与target作差，比较差的绝对值，若该值更接近，则替换。再将和与target比较，若sum<target，则左指针后移，若sum>target,则右指针往前面移，若相等，直接return target。