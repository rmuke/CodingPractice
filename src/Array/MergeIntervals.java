package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
      Arrays.stream(mergeIntervals(new int[][]{{1,3},{2,6},{8,10},{15,18}})).map(Arrays :: toString).forEach(System.out :: println);
    }

    public static int[][] mergeIntervals(int[][] intervals){

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals,(o1,o2)-> Integer.compare(o1[0],o2[0]));

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){

            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
