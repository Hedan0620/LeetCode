package easy._013;

class Solution {
    public int romanToInt(String s) {
        //表驱动法：建立表
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        char[] arr = s.toCharArray();
        String s1,s2;
        int i = arr.length-1,res=0,j=12;
        while(i>=0){
            s1 = String.valueOf(arr[i]); //单个的字符转成String
            if(i>0){//两个字符转String
                s2 = String.valueOf(arr[i-1])+s1;
            }else
                s2="";
            while(true){
                if(s1.equals(strs[j])){
                    res = res + nums[j];
                    i--;
                    break;
                }
                else if(s2.equals(strs[j])){
                    res = res + nums[j];
                    i=i-2;
                    break;
                }else
                    j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("IV"));
    }
}