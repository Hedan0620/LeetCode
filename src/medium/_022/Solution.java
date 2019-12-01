package medium._022;

import java.util.ArrayList;
import java.util.List;

//用回溯法
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<String>();
        backtrace(ls,"",0,0,n);
        return ls;

    }
    public void backtrace(List<String> ls,String cur,int L,int R,int n){
        if(L+R==n*2){
            ls.add(cur);
            return;
        }
        //左括号>=右括号的元素
        if(L<n){
            backtrace(ls,cur+'(',L+1,R,n);
        }
        if(R<L){
            backtrace(ls,cur+')',L,R+1,n);
        }
    }
}
