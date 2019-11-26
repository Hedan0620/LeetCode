package easy._009;

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        int len = arr.length;
        int j;
        for(int i=0;i<len/2;i++){
            j=len-1-i;
            if(arr[i]!=arr[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(2222222));
    }
}