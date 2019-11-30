package medium._017;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
//运用LinkedList的一种巧妙解法
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ls = new LinkedList<String>();
        if(digits.length()==0)
            return ls;
        HashMap<Integer,char[]> map = new HashMap<>();
        map.put(2,new char[]{'a','b','c'});
        map.put(3,new char[]{'d','e','f'});
        map.put(4,new char[]{'g','h','i'});
        map.put(5,new char[]{'j','k','l'});
        map.put(6,new char[]{'m','n','o'});
        map.put(7,new char[]{'p','q','r','s'});
        map.put(8,new char[]{'t','u','v'});
        map.put(9,new char[]{'w','x','y','z'});

        char[] arr = digits.toCharArray();
        ls.add("");
        for(int i =0;i<arr.length;i++) {
            int x = arr[i]-'0';
            while (ls.peek().length()==i){
                String t = ls.poll();
                char[] temp = map.get(x);
                for(char c:temp)
                    ls.add(t+c);
            }
        }
        return ls;
    }

}
