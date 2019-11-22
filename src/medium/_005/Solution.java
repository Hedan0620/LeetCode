package medium._005;

class Solution {
    public String longestPalindrome(String s) {
        int maxlen=0;
        String maxString="";
        if(s.length()==1 || s.length()==0)
            return s;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    //检查i-j之间的字符串是否对称
                    if(CheckString(s,i,j)&&(j-i+1)>maxlen){
                        maxlen = j-i+1;
                        maxString = s.substring(i,j+1);
                    }

                }
            }
        }
        if(maxlen==0){
            return Character.toString(s.charAt(0));
        }
        return maxString;
    }
    private boolean CheckString(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}