package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest {

    public static void main(String[] args) {
        System.out.println(kthLargest(new String[]{"3","6","7","10"},4));
        System.out.println(kthLargestUsingMaxHeap(new int[]{10,6,3,10},2));

    }

    public static  String kthLargest(String[] nums,int k){


        PriorityQueue<String> minHeap = new PriorityQueue<>((o1,o2)->{
            if(o1.length()==o2.length()){
                return o1.compareTo(o2);
            }
            return Integer.compare(o1.length(),o2.length());
        });
        for(String num : nums){
            minHeap.offer(num);
            if(k < minHeap.size()){
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }

    public static  int kthLargestUsingMaxHeap(int[] nums,int k){

        //  10,6,3,10
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
            System.out.println("before"+Arrays.toString(minHeap.toArray()));
            if(k < minHeap.size()){
                minHeap.poll();
            }
            System.out.println("after"+Arrays.toString(minHeap.toArray()));
        }
        return minHeap.poll();
    }

    public static int secondLargestElement(int[] nums){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > 2){
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }


}
