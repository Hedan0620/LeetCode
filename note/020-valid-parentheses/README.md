# [20. Valid Parentheses](https://leetcode-cn.com/problems/valid-parentheses/)

## 解题思路

1. 用HashMap存储三对括号，右括号的作为key，左括号作为value。因为找到左括号是进栈，右括号是和栈顶元素匹配，所以右括号得作为key。
2. 出栈要判断栈是否为空，返回时也要判断栈是否元素全部出栈（栈为空）。
3. stack.isEmpty() 和 stack.empty() 功能和用法是相同的，这是JDK不同版本，为了兼容，所以原始的用法保留下来了。
4. HashMap的map.containsKey(cur)，这个函数功能是查找cur是否是map的关键字，如果是，返回true，反之，返回false。