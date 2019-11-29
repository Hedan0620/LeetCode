package medium._015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        //排序，双指针法
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //跳过重复答案
            if(i==0 || nums[i]!=nums[i-1])
            {
                int L=i+1,R=nums.length-1,sum=0-nums[i];
                while (L<R){
                    if(nums[L]+nums[R]<sum)
                        L++;
                    else if(nums[L]+nums[R]>sum)
                        R--;
                    else{
                        ls.add(Arrays.asList(nums[i],nums[L],nums[R]));
                        //过滤掉重复元素
                        while (L<R && nums[L]==nums[L+1]) L++;
                        while (L<R && nums[R]==nums[R-1]) R--;
                        L++;
                        R--;
                    }
                }
            }
        }
        return ls;
    }
}
