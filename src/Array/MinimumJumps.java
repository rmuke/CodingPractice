package Array;

public class MinimumJumps {

    public static void main(String[] args) {
        System.out.println(minJump(new int[]{2,3,1,1,4}));
    }

    public static int minJump(int[] nums){

        int n=nums.length-1,currEnd=0,currFarthest=0,jump=0;

        for(int i=0;i<n;i++){
            currFarthest = Math.max(currFarthest,i+nums[i]);

            if(i==currEnd){
                jump++;
                currEnd = currFarthest;
            }
        }
        return jump;
    }
}

