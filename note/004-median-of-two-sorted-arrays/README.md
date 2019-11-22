#  [4. Median of Two Sorted Arrays](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/)

## 题目

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

**Example 1:**

```
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
```


**Example 2:**

```
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```

## 解题思路

时间复杂度要求O(log~2~(m+n))，看到log，说明要用二分法。

求中位数，可以转换成求第`k`小的数的一种特殊情况。

**两个有序的数组，求第`k`小的数的解法如下：**

- 假设我们要找第7小的数，

![image.png](https://pic.leetcode-cn.com/735ea8129ab5b56b7058c6286217fa4bb5f8a198e4c8b2172fe0f75b29a966cd-image.png)

我们比较两个数组的第 `k/2` 个数，若k是奇数，向下取整。也就是比较第3个数，上边数组的4和下边数组的3，哪个小，表明该数组的前`k/2`个都不是第`k`小的数字，故可以排除。

- 更新后的排序数组如下：（橙色部分表示已经去掉的数字），此时只要找第`7-3=4`小的数，同样地方式比较两个数组，排除一半的元素。

![image.png](https://pic.leetcode-cn.com/09b8649cd2b8bbea74f7f632b098fed5f8404530ff44b5a0b54a360b3cf7dd8f-image.png)

- 上边数组的3小于下边数组的5，故排除上边的2个元素，此时k=2。

![image.png](https://pic.leetcode-cn.com/f2d72fd3dff109ad810895b9a0c8d8782f47df6b2f24f9de72704961bc547fcb-image.png)

- 由于两个数相等，无论去掉哪个数组中的都行，因为去掉1个总会保留另1个，所以没有影响。假设去掉下边数组的4。此时k=1

![image.png](https://pic.leetcode-cn.com/3c89a8ea29f2e19057b57242c8bc37c5f09b6796b96c30f3d42caea21c12f294-image.png)

- 我们要找第1小的数字，只需要判断两个数组中第1个数字哪个小就可以了，也就是4。

###### 特殊情况：

- 我们每次都是取`k/2`的数进行比较，有时会遇到数组的长度小于`k/2`，如下：

  ![image.png](https://pic.leetcode-cn.com/ad87d1f63a9bbd99e12605686290800ce61b03f9fb98d87f1d8c020d404421ac-image.png)
  
- 此时`k/2=3`,而上边数组的长度是2，我们此时将箭头指向它的末尾。由于2<3,导致上边数组的1、2都被排除，结果如下：

  ![image.png](https://pic.leetcode-cn.com/7ea1963f184b1dcaddf951326ccbe7aa09cfbb9ebee7fffb2ede131853b3d1de-image.png)
  
- 由于上边数组为空，只需要返回下边数组的第5个数字就可以了。

###### 总结

* 无论是找第奇数个还是偶数个数字，对算法并没有影响。因为k的值有可能从奇数变成偶数，最后变为1，或者由于某一个数组空了，直接返回结果。
* 可采用递归的思路，递归的出口是：
  * 某个数组为空，直接返回另一个数组第k小的数。
  * k==1，比较两个数组的第一个数，返回小的那个。
* 为了防止数组长度小于k/2，所以每次比较`min(k/2,len(arr))`对应的数字，把小的那个对应的数组的数字排除，将更新后的两个新数组送入递归，并且k要减去排除的数字个数。

###### 注意的点

* 求中位数是排序后的数组，下标为中间的数，求第k小的数，下标是k-1：

  * 若（m+n）为奇数，求中位数等价于求第（m+n）/2+1小的数;
  * 若（m+n）为偶数，求中位数等价于求第(m+n)/2小的数和第(m+n)/2+1的数之和再乘以0.5，结果是浮点型。

