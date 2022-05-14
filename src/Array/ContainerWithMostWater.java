package Array;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(containerWithMostMostWater(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int containerWithMostMostWater(int[] heights){

        int maxArea =0, left =0,right = heights.length-1;

        while(left < right){
            maxArea = Math.max(maxArea,Math.min(heights[left],heights[right])*(right-left));

            if(heights[left] < heights[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
