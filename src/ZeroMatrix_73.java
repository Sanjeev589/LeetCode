public class ZeroMatrix_73 {

    public void setZeroes(int[][] matrix) {

        int i,j, col0=1, row0 =1, row = matrix.length , col = matrix[0].length;
        for(i=0;i<col;i++)
            if(matrix[0][i]==0)
                row0 =0;
        for(j=0;j<row;j++){
            if(matrix[j][0]==0)
                col0 =0;
        }

        for(i =1;i<row ;i++){
            for(j =1; j<col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] =0;
                }
            }
        }

        for(i=row-1; i>=0;i--){
            for(j=col-1; j>=0; j--){
                if(matrix[i][0] ==0 || matrix[0][j] ==0)
                    matrix[i][j] = 0 ;
            }
        }
        if(col0 == 0){
            for(i=0;i<row;i++)
                matrix[i][0] =0;
        }
        if(row0 ==0){
            for(j=0;j<col;j++)
                matrix[0][j] =0;
        }
    }
}
