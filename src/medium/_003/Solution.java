package medium._003;

import java.security.cert.TrustAnchor;
import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlen = 0;
        int len;
        for(int j=0;j<s.length();j++){
            len = 0;
            int i=j;
            boolean flag = true;
            while(flag && i<s.length()) {
                Integer value = map.get(s.charAt(i));
                if (value == null) {//不重复，加入子串
                    len++;
                    map.put(s.charAt(i), 1);
                    i++;
                } else {//重复，中断子串,回到第二个位置
                    if (len > maxlen) {
                        maxlen = len;
                    }
                    map.clear();
                    flag = false;
                }
            }
            if(flag && len>maxlen){
                maxlen = len;
                map.clear();
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}