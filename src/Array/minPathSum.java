package Array;

import java.util.Arrays;

public class minPathSum {

    public static void main(String[] args) {
        System.out.println(minSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }

    public static int minSum(int[][] matrix){

        int m = matrix.length,n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=0 && j==0) matrix[i][j]+=matrix[i-1][j];
                if(i==0 && j!=0) matrix[i][j]+=matrix[i][j-1];
                if(i!=0 && j!=0) matrix[i][j]+=Math.min(matrix[i-1][j],matrix[i][j-1]);
            }
        }
        Arrays.stream(matrix).map(Arrays :: toString).forEach(System.out :: print);
        return matrix[m-1][n-1];
    }
}
