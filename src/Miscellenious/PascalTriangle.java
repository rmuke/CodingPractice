package Miscellenious;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }

    public static List<List<Integer>> pascalTriangle(int numOfRows){

        List<List<Integer>> allRows = new ArrayList<>();

        List<Integer> row = new ArrayList<>();

        for(int i=0;i<numOfRows;i++) {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++) {
                row.set(j,row.get(j)+row.get(j+1));
            }
            allRows.add(new ArrayList<>(row));
        }
     return allRows;
    }

}
