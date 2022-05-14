package Array;

public class PeakElement {

    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{1,2,3,4,2,1}));
    }

    private static int peakElement(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    private static int helper(int[] nums, int low, int high) {

        if(low==high){
            return low;
        }else{
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;

            if(nums[mid1] > nums[mid2]){
                return  helper(nums,low,mid1);
            }else{
                return  helper(nums,mid2,high);
            }
        }
    }
}
