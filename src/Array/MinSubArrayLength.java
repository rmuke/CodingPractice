package Array;

public class MinSubArrayLength {

    public static void main(String[] args) {
        System.out.println(minLenSum(new int[]{1,2,3,4},7));
    }

    private static int minLenSum(int[] nums, int target) {

        int sum=0,from=0,len = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum >= target) {
                len = Math.min(len, i - from + 1);
                sum -= nums[from++];
            }
        }
        return len;
    }


}
