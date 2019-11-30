package medium._016;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close_sum =  nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++) {
            int L = i + 1, R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (Math.abs(close_sum - target) > Math.abs(sum - target))
                    close_sum = sum;
                if (sum > target)
                    R--;
                else if (sum < target)
                    L++;
                else
                    return target;
            }
        }
        return close_sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,2,1,-3};
        System.out.println(s.threeSumClosest(nums,1));
    }
}
