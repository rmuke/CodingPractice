package Array;

import java.util.Arrays;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFirstAndLastPosition(new int[]{5,7,7,8,8,10},8)));

    }

    public static int[] findFirstAndLastPosition(int[] nums,int target){
        double left = target - 0.5, right = target + 0.5;
        int l = binarySearch(nums,left),r= binarySearch(nums,right);
        if(l==r) return new int[]{-1,-1};
        return new int[]{l,r-1};
    }

    public static int binarySearch(int[] nums,double target){
        int l = 0,r = nums.length-1;
        while(l<=r){
            int m = l +(r-l)/2;
            if(nums[m]<target){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return l;
    }




}
