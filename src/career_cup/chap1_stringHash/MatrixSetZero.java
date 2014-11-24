/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CareerCup.Chap1_StringHash;

/**
 *
 * @author huijun
 */
public class MatrixSetZero {
    public static int[][] matrixSetZero(int[][] matrix, int m, int n){
        /*This way is incorrect, it will pass the matrix reference to copy!!!*/
        //int[][] copy = matrix; 
        
        int[][] copy = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                copy[i][j] = matrix[i][j];               
            }
        }
            
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("i = " + i + " , j = " + j);
                if(matrix[i][j] == 0){                    
                    for(int k = 0; k < n; k++){
                        copy[i][k] = 0;
                    }
                    for(int h = 0; h < m; h++){
                        copy[h][j] = 0;
                    }
                }
            }
        }
        return copy;
    }
    
}
