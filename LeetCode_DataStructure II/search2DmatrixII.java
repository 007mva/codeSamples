/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

*/
 public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1, col=0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]>target){
                row--;
            }

            else if(matrix[row][col]<target){
                col++;
            }
            else {
                return true;
            }
        }


            return false;
    }