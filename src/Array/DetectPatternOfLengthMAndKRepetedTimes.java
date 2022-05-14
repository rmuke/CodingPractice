package Array;

public class DetectPatternOfLengthMAndKRepetedTimes {

    public static void main(String[] args) {
        System.out.println(detectPattern(new int[]{1,2,1,2,2,2,3,4},1,6));
    }

    public static boolean detectPattern(int[] arr,int m,int k) {
        int count =0;
        for(int i=0,j=i+m;j<arr.length;i++,j++){
            if(arr[i]!=arr[j]){
                count = 0;
            }else if(++count == (k-1)*m){
                return true;
            }
        }
        return false;
    }
}
