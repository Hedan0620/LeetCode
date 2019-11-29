package medium._012;

class Solution {
    public String intToRoman(int num) {
        //表驱动法：建立表
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";
        for(int i =0 ;i<13 && num>0;i++){
            int k = num/nums[i];
            for(int j =0;j<k;j++)
                res = res + strs[i];
            num = num%nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.intToRoman(3));
    }
}