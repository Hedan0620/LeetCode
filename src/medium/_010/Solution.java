package medium._010;

//双指针法
class Solution {
    public int maxArea(int[] height) {
        int i = 0,j=height.length-1,area = 0,temp;
        while(i<j){
            if(height[i] < height[j])
            {
                temp = height[i]*(j-i);
                if(temp>area)
                    area = temp;
                i++;
            }
            else
            {
                temp = height[j]*(j-i);
                if(temp>area)
                    area = temp;
                j--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(height));
    }
}