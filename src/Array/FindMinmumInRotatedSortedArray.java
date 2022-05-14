package Array;

public class FindMinmumInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMinInRotatedSortedArray(new int[]{3,4,5,1,2}));
    }

    public static int findMinInRotatedSortedArray(int[] nums){

        int left = 0;
        int right = nums.length-1;

        while(left < right){

            int mid = left + (right - left)/2;
            if(nums[mid]<nums[right]){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return nums[left];
    }
}
