package Array;

public class FindElementSearchInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findElement(new int[]{4,5,6,7,0,1,2},0));
    }

    public  static int findElement(int[] nums,int target){

        int start = 0,end = nums.length-1;

        while(start<=end){

            int mid = (start+end)/2;
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid] < nums[start] || nums[mid] < nums[end]){
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }else if(nums[mid] > nums[start] || nums[mid] > nums[end]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                end--;
            }
        }
        return -1;
    }
}
