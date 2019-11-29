package easy._014;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = 0;
        boolean flag = true;
        //以第一个作为模板
        while(strs.length>0 && len<strs[0].length() && flag){
            for(int i=1;i<strs.length;i++){
                if(len<strs[i].length() && strs[0].charAt(len)==strs[i].charAt(len)){
                    System.out.println(strs[0].charAt(len));
                    System.out.println(strs[i].charAt(len));
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag)
                len++;
        }
        if(len>0)
            return strs[0].substring(0,len);
        else
            return "";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strs = {};
        System.out.println(s.longestCommonPrefix(strs));
    }
}
