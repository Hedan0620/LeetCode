package medium._018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //排序，固定前面两个，双指针
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                int L=j+1,R=nums.length-1;
                int sum = target-nums[i]-nums[j];
                while (L<R){
                    if(nums[L] + nums[R] == sum){
                        ls.add(Arrays.asList(nums[i],nums[j],nums[L],nums[R]));
                        while (L<R && nums[L+1]==nums[L]) L++;
                        while (L<R && nums[R-1]==nums[R]) R--;
                        L++;
                        R--;
                    }
                    else if(nums[L]+nums[R]<sum){
                        while (L<R && nums[L]==nums[L+1]) L++;
                        L++;
                    }
                    else{
                        while (L<R && nums[R]==nums[R-1]) R--;
                        R--;
                    }
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,0,0,0,0,0};
        System.out.println(s.fourSum(nums,0));
    }
}
