package easy._028;

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null || needle.length()==0)
            return 0;
        int nlen = needle.length();
        int hlen = haystack.length();
        int len = hlen - nlen;
        for(int i=0;i<=len;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+nlen).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}
