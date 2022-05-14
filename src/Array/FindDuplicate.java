package Array;

public class FindDuplicate {

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,1,2,3}));
    }

    private static int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        slow = 0;

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
