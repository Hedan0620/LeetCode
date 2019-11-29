## 扩展：Java中char和String的相互转化

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
