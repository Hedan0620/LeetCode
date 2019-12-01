package easy._020;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                char top = stack.empty()? '#':stack.pop();
                //判断栈顶元素
                if(map.get(c)!=top)
                    return false;
            }
            else{//左边的，进栈
                stack.push(c);
            }
        }
        return stack.isEmpty();//isEmpty()和empty()功能相同
    }
}
