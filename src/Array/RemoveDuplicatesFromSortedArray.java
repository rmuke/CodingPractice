package Array;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromSortedArray(new int[]{0,1,1,2,2,2,2,3,3,4}));
    }

    public static int removeDuplicatesFromSortedArray(int[] nums){

        if(nums.length==0) return 0;

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];
                System.out.print(nums[j]+" ");
            }
        }
        return ++j;
    }
}
