package Array;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {

        System.out.println(medianOfTwoSortedArray(new int[]{1,2},new int[]{3,4}));
    }

    public static double medianOfTwoSortedArray(int[] nums1,int[] nums2) {

        double median1=0,median2=0;
        int index1=0,index2=0,len1= nums1.length,len2= nums2.length;
        int end = (len1+len2)/2;
        for(int count =0;count<=end;count++){
            median2=median1;

            if(index1 != len1 && index2  != len2){
                median1= nums1[index1] > nums2[index2] ? nums2[index2++] : nums1[index1++];
            }else if(index1 < len1){
                median1 = nums1[index1++];
            }else{
                median1 = nums2[index2++];
            }
        }
        if((len1+len2)%2==0){
            return (median1+median2)/2;
        }else{
            return median1;
        }
    }
}
