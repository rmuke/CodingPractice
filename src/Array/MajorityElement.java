package Array;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3,3,1,1,1,1,1,1,1}));
    }

    public static int majorityElement(int[] nums){


        int count = 0,major = nums[0];

        for(int i=1;i< nums.length;i++){
            if(count == 0){
                major = nums[i];
                count = 1;
            }else if(major == nums[i]){
                count++;
            }else{
                count--;
            }
        }
       return major;
    }
}
