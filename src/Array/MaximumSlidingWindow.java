package Array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumSlidingWindow {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }

    private static int[] maxSlidingWindow(int[] nums,int k) {

        Deque<Integer> dq = new ArrayDeque();
        int[] result = new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){

            if(!dq.isEmpty() && dq.peek() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(i-k+1 >= 0){
                result[i-k+1]= nums[dq.peek()];
            }
        }
        return result;
    }
}
