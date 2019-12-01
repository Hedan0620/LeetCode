package medium._017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//运用回溯法
class Solution2 {
    List<String> ls = new ArrayList<String>();
    HashMap<Integer,char[]> map = new HashMap<Integer,char[]>(){{
       put(2,new char[]{'a','b','c'});
       put(3,new char[]{'d','e','f'});
       put(4,new char[]{'g','h','i'});
       put(5,new char[]{'j','k','l'});
       put(6,new char[]{'m','n','o'});
       put(7,new char[]{'p','q','r','s'});
       put(8,new char[]{'t','u','v'});
       put(9,new char[]{'w','x','y','z'});
    }};

    public void backtrack(String combination,char[] arr,int start){
        if(start==arr.length){
            ls.add(combination);
        }
        else{
            int x = arr[start] - '0';
            char[] temp = map.get(x);
            for(int i=0;i<temp.length;i++){
                //把当前的字母加入到组合中
                String curLetter = Character.toString(temp[i]);
                backtrack(combination+curLetter,arr,start+1);
            }
        }

    }

    public List<String> letterCombinations(String digits) {
        char[] arr = digits.toCharArray();
        if(digits.length()!=0)
            backtrack("",arr,0);
        return ls;
    }
}