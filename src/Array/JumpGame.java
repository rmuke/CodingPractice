package Array;

public class JumpGame {

    public static void main(String[] args) {
        System.out.println(isReached(new int[]{2,3,1,1,4}));
    }

    public static boolean isReached(int[] nums){

        int maxLocation = 0;

        for(int i=0;i<nums.length;i++){
            if(i>maxLocation) return false;
            maxLocation = maxLocation < i+nums[i] ? i+nums[i] : maxLocation;
        }
        return true;
    }
}
