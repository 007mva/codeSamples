/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to 
modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

*/

public void rotate(int[][] matrix) {
        int l=matrix.length;
        for(int i=0;i<(l+1)/2;i++){
            for(int j=0;j<l/2;j++){
                int temp=matrix[l-j-1][i];
                matrix[l-j-1][i]=matrix[l-i-1][l-j-1];
                matrix[l-i-1][l-j-1]=matrix[j][l-i-1];
                matrix[j][l-i-1]=matrix[i][j];
                matrix[i][j]=temp;

            }
        }
    }
