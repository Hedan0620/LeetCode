package easy._001;

import java.util.HashMap;

class Solution2 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer value = map.get(nums[i]);
            if(value!=null){//找到了
                return new int[]{value,i};
            }
            map.put(target-nums[i],i);//把下标i要寻找的值放进去
        }
        return null;
    }
}
