package hard._004;

import javax.sound.midi.Soundbank;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = nums1.length+nums2.length;
        if(k%2!=0)//奇数
            return getKth(nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1, k / 2);
        else{
            double midLeft = getKth(nums1,nums2,0,nums1.length-1,0,nums2.length-1,k/2);
            double midRight = getKth(nums1, nums2, 0, nums1.length-1, 0, nums2.length-1, k / 2 + 1);
            return (midLeft+midRight)/2;
        }
    }
    private int getKth(int[] nums1,int[] nums2,int start1,int end1,int start2,int end2,int k){
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //结束递归
        if (len1==0)
            return nums2[start2+k-1];
        if(len2==0)
            return nums1[start1 + k - 1];
        if(k==1)
            return Math.min(nums1[start1],nums2[start2]);
        //递归
        //start指针往后移动k/2个单位，若len<k/2,则移动len个单位
        int move1 = start1 + Math.min(k / 2, len1)-1;//k/2下取整,要删除元素的下标
        int move2 = start2 + Math.min(k/2,len2) -1;
        if(nums1[move1]<nums2[move2]){
            //删除num1前面的元素
            return getKth(nums1,nums2,move1+1,end1,start2,end2,k-(move1-start1+1));
        }else{
            //删除num2前面的元素
            return getKth(nums1,nums2,start1,end1,move2+1,end2,k-(move2-start2+1));
        }
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(a.findMedianSortedArrays(arr1,arr2));
    }
}
