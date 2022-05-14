package Array;

import java.util.Arrays;
import java.util.Stack;

public class NexrGreatterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreatterElement(new int[]{2,0,-1})));
    }

    public static int[] nextGreatterElement(int[] nums){
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                next[stack.pop()] = nums[i%n];
            }
            stack.push(i%n);
        }
        return next;
    }
}
