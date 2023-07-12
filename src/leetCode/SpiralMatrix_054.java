package leetCode;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.
 */
public class SpiralMatrix_054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int bottom = matrix.length -1;
        int right = matrix[0].length -1;
        int top=0, left=0;
        int count =0, totalCount = matrix.length*matrix[0].length ;
        while(count<totalCount){
            for(int k = left; k<= right && count<totalCount;k++, count++)
                ans.add(matrix[top][k]) ;
            top++;
            for(int k = top; k<= bottom && count<totalCount ; k++, count++)
                ans.add(matrix[k][right]);
            right--;

            for(int k =right; k>=left && count<totalCount;k--, count++)
                ans.add(matrix[bottom][k]);
            bottom--;



            for(int k= bottom;k>= top && count<totalCount; k--, count++)
                ans.add(matrix[k][left]);
            left++;


        }
        return ans;
    }
}
