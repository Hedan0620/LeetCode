# [17. Letter Combinations of a Phone Number](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/)

## 解题思路1

运用LinkedList队列的特性，**非常巧妙**的解法。

1. Hash Table存储数字和其对应的字符数组。
2. 遍历字符串，获取数字，如果列表数组ls的头部元素（peek()或者element()方法）的长度和数组下标一致，表示还未加入组合数字。例如，digits="23",当ls是a->b->c,i=1时，ls的头部元素a的长度是1，还需要加入3对应的字符数组d,e,f,将头部元素移出(remove()或poll()方法)到临时字符串temp，遍历字符数组d，e，f，temp逐个和他们相加后add到ls数组中。

## 解题思路2

运用回溯法。

![image-20191201132643589](C:\Users\HNU\AppData\Roaming\Typora\typora-user-images\image-20191201132643589.png)

如上图，先是“”逐个和a，b，c组合，a又接着逐个和d，e，f组合，这个过程是重复的，直到字符串的最后一个元素。可以用回溯的方法，先组合，再递归下一次的组合。

```java
int x = arr[start] - '0';
char[] temp = map.get(x);
for(int i=0;i<temp.length;i++){
    //把当前的字母加入到组合中
    String curLetter = Character.toString(temp[i]);
    backtrack(combination+curLetter,arr,start+1);
}
```

回溯的出口是

```java
if(start==arr.length){
	ls.add(combination);
}
```

比如最左边的ad，遍历到了字符串最后一个元素，此时把ad加入到输出队列ls中。