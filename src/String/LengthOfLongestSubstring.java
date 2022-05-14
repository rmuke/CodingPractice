package String;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("parmkl"));
        System.out.println(lengthOfLongestSubstringSlidingWindowSolution("pwwkew"));
    }

    private static int lengthOfLongestSubstring(String str) {

        int[] charMap = new int[256];
        Arrays.fill(charMap,-1);
        int max = Integer.MIN_VALUE;
        int i =0;
        for(int j=0;j< str.length();j++){
            if(charMap[str.charAt(j)]>=i){
                i = charMap[str.charAt(j)]+1;
            }
            charMap[str.charAt(j)] = j;
            max = Math.max(max,j-i+1);
        }
        return max > 0? max : 0;
    }

    private static int lengthOfLongestSubstringSlidingWindowSolution(String s){
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.poll();
            }
            queue.offer(c);
            res = Math.max(res, queue.size());
        }
        return res;
    }


}
